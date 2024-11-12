package dev.nampd.coursehub.service;

import dev.nampd.coursehub.model.dto.StudentDto;
import dev.nampd.coursehub.model.entity.Student;

public interface EmailService {
    // Gửi email nhắc nhở sinh viên chưa đăng ký khóa học
    void sendStudentReminderEmail(StudentDto student);

    // Gửi email thông báo khóa học còn chỗ và sắp hết hạn đăng ký
    void sendCourseExpirationEmail(String courseName, String recipientEmail);
}