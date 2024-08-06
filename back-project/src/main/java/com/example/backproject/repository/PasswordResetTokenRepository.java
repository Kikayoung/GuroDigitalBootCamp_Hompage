package com.example.backproject.repository;

import com.example.backproject.entity.PasswordResetToken;
import com.example.backproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
    void deleteByToken(String token);

    PasswordResetToken findByUser(User user);
}
