module student {
    
    requires javafx.fxml;
    requires javafx.controls;
    requires org.slf4j;
    requires java.sql;
    
    exports top.yanquithor.fxml;
    exports top.yanquithor.base;
    exports top.yanquithor.dao;
    exports top.yanquithor.service;
    exports top.yanquithor.controller;
    exports top.yanquithor.util;
    opens top.yanquithor.fxml to javafx.fxml;
}