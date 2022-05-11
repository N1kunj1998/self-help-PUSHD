### Hii there :wave:

This is the documentation part of the backend of self help push-D app. the main core part of the backend is in Login-service.<br />

Go to -> self-help-PUSHD/Login-Service/src/main/java/com/example/LoginService/<br />

## DTO 
# The DTOs are mainliy used for the conversion of one class of data to another class of data 

## Config
# the config class contains configuration for the web configuration part UserDetails service class part and its impl part which is used in JWT.
CustomUserDetails.java<br />
MyConfig.java<br />
UserDetailServiceImpl.java<br />

## Controller 
# Controller are the main api end points that will be used for the communication
DetailsController.java<br />
ForgetController.java<br />
LoginController.java<br />
QuestionController.java<br />
QuizController.java<br />
QuizResponseController.java<br />
TestController.java<br />
TimestampController.java<br />

## DAO
# dao is a simple java class which contains JDBC logic . Data Access Layer has proven good in separate business logic layer and persistent layer.
DoctorRepository.java<br />
LoginTableRepository.java<br />
PatientRepository.java<br />
QuestionRepository.java<br />
QuizRepository.java<br />
QuizResponseRepo.java<br />
SpecialistRepository.java<br />
TimestampRepo.java<br />

## helper class
# a helper class is used to assist in providing some functionality, which isn't the main goal of the application or class in which it is used.
JwtUtil.java<br />
Schedulemail.java<br />

## model class
# A model class is typically used to "model" the data in your application. For example you could write a Model class that mirrors a database table
Doctor.java<br />
ForgotPasswordRequest.java<br />
JwtResponse.java<br />
LoginRequest.java<br />
LoginResponse.java<br />
LoginTable.java<br />
Patient.java<br />
QResponse.java<br />
Questions.java<br />
Quiz.java<br />
QuizRes.java<br />
Specialist.java<br />
Timestamp.java<br />

## service class
# A service class is a named group of work within a workload with similar performance goals, resource requirements, or business importance.
DoctorService.java<br />
EmailService.java<br />
FetchemailService.java<br />
LoginTableService.java<br />
PatientService.java<br />
QuestionService.java<br />
QuizResponseService.java<br />
QuizService.java<br />
SpecialistService.java<br />
TimestampService.java<br />
