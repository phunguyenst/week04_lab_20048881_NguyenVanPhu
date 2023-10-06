CREATE DATABASE IF NOT EXISTS phudb;
USE phudb;

-- Tạo bảng Candidate
CREATE TABLE Candidate (
    can_id BIGINT PRIMARY KEY,
    fullName VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(20),
    age INT
);

-- Tạo bảng Job
CREATE TABLE Job (
    job_id BIGINT PRIMARY KEY,
    jobTitle VARCHAR(255),
    descripttion VARCHAR(255),
    location VARCHAR(255),
    salary DECIMAL(10, 2),
    can_id BIGINT,
    FOREIGN KEY (can_id) REFERENCES Candidate(can_id)
);

-- Tạo bảng Skill
CREATE TABLE Skill (
    skill_id BIGINT PRIMARY KEY,
    skillName VARCHAR(255)
);

-- Tạo bảng CandidateSkill (quan hệ nhiều-nhiều giữa Candidate và Skill)
CREATE TABLE CandidateSkill (
    can_id BIGINT,
    skill_id BIGINT,
    level INT,
    PRIMARY KEY (can_id, skill_id),
    FOREIGN KEY (can_id) REFERENCES Candidate(can_id),
    FOREIGN KEY (skill_id) REFERENCES Skill(skill_id)
);

-- Chèn dữ liệu vào bảng Candidate
INSERT INTO Candidate (can_id, fullName, email, phone, age)
VALUES (1, 'John Doe', 'john.doe@example.com', '1234567890', 30);

INSERT INTO Candidate (can_id, fullName, email, phone, age)
VALUES (2, 'Jane Smith', 'jane.smith@example.com', '9876543210', 25);

-- Chèn dữ liệu vào bảng Job và liên kết với Candidate
INSERT INTO Job (job_id, jobTitle, descripttion, location, salary, can_id)
VALUES (1, 'Software Engineer', 'Develop software applications', 'San Francisco', 100000.00, 1);

INSERT INTO Job (job_id, jobTitle, descripttion, location, salary, can_id)
VALUES (2, 'Data Scientist', 'Analyze data and build models', 'New York', 120000.00, 1);

-- Chèn dữ liệu vào bảng Skill
INSERT INTO Skill (skill_id, skillName)
VALUES (1, 'Java');

INSERT INTO Skill (skill_id, skillName)
VALUES (2, 'Python');

-- Chèn dữ liệu vào bảng CandidateSkill
INSERT INTO CandidateSkill (can_id, skill_id, level)
VALUES (1, 1, 3);

INSERT INTO CandidateSkill (can_id, skill_id, level)
VALUES (1, 2, 4);