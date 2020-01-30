### **政府管理学院学生活动管理系统**
一、搭建流程（初步）

    spring boot
    ide: idea
    maven项目  使用阿里云maven镜像
    使用spring快速搭建框架

###
    使用模块  
        `Spring web`
        `Devtools`
        `Spring jpa`
        `mysql connector driver`
        `thymeleaf`     
    
    
二、项目目录

    日志：./log文件夹

###
            ./src/main/java/com.bnu.sg.system下
                /aspect  日志记录 URL ip 类 参数 返回结果
                /controller 控制器
                /handler  拦截器
###                
            ./src/main/resources下
                /static 静态文件
                /templates 容器（网页）
                    /templates/error 错误页面
###
            ./src/main/resources目录下
                三个配置文件
                application-dev.properties为开发模式配置文件
                application-pro.properties为产品配置文件
                通过application.propertie管理当前配置文件
    
    