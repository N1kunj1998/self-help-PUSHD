### Hii there :wave:

This is the documentation part of the backend of self help push-D app. the main core part of the backend is in Login-service.

Go to -> self-help-PUSHD/Login-Service/src/main/java/com/example/LoginService/

## DTO 
# The DTOs are mainliy used for the conversion of one class of data to another class of data 

## Config
# the config class contains configuration for the web configuration part UserDetails service class part and its impl part which is used in JWT.
CustomUserDetails.java
MyConfig.java
UserDetailServiceImpl.java

## Controller 
# Controller are the main api end points that will be used for the communication
DetailsController.java
ForgetController.java
LoginController.java
QuestionController.java
QuizController.java
QuizResponseController.java
TestController.java
TimestampController.java

## DAO
# dao is a simple java class which contains JDBC logic . Data Access Layer has proven good in separate business logic layer and persistent layer.
DoctorRepository.java
LoginTableRepository.java
PatientRepository.java
QuestionRepository.java
QuizRepository.java
QuizResponseRepo.java
SpecialistRepository.java
TimestampRepo.java

## helper class
# a helper class is used to assist in providing some functionality, which isn't the main goal of the application or class in which it is used.
JwtUtil.java
Schedulemail.java

## model class
# A model class is typically used to "model" the data in your application. For example you could write a Model class that mirrors a database table
Doctor.java
ForgotPasswordRequest.java
JwtResponse.java
LoginRequest.java
LoginResponse.java
LoginTable.java
Patient.java
QResponse.java
Questions.java
Quiz.java
QuizRes.java
Specialist.java
Timestamp.java

## service class
# A service class is a named group of work within a workload with similar performance goals, resource requirements, or business importance.
DoctorService.java
EmailService.java
FetchemailService.java
LoginTableService.java
PatientService.java
QuestionService.java
QuizResponseService.java
QuizService.java
SpecialistService.java
TimestampService.java
