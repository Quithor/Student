# 一、窗口相关

## 1. 主类

## 2. controller类

## 3. fxml文件

# 二、弹窗相关

## 1. `Alert`

`Alert`是JavaFX中最常用的弹窗类型，用于显示简单的消息给用户。

以下是用法示例

```java
    Alert alert = new Alert(AlertType.INFORMATION);			// 创建对象时指定弹窗类型
    alert.setTitle("Information Dialog");  				    // 设置弹窗标题
    alert.setHeaderText("Look, an Information Dialog");  	// 设置弹窗内部的标题
    alert.setContentText("This dialog displays a message and a set of buttons.");  
    														// 设置弹窗的文本
    alert.show(); 
```

创建`Alert`对象时传入的参数为`AlertType`对象，`AlertType`是枚举类，其中的对象为：  

- NONE                           无类型弹窗
- INFORMATION            信息型弹窗
- WARNING                    警告型弹窗
- CONFIRMATION         确认型弹窗
- ERROR                          报错型弹窗

使用`setTitle()`方法设置弹窗的标题，使用`setHeaderText()`方法设置窗口的头文本，使用`setContentText()`方法设置弹窗的文本，最后使用`show()`方法显示弹窗。

**温馨提示**： 示例中的写法需要静态导入`javafx.scene.control.Alert.AlertType`或者将代码中的`AlertType`改为`Alert.AlertType`

## 2. Dialog

这是一个自定义的弹窗类，是JavaFX框架的高阶用法

这个弹窗自定义程度很高不建议初学者调用

# 更多详情请见官网

[JavaFX官方API文档](https://openjfx.io/javadoc/22/index.html)