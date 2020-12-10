package com.shakhovmv.rostelecom.service;

import com.shakhovmv.rostelecom.model.User;

public interface UserService {
    void saveToDB(User user);
    void saveToFile(User user);
}
