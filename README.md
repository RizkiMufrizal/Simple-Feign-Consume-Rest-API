# Simple-Feign-Consume-Rest-API

Project ini dibuat dalam rangka belajar kotlin dan feign

Cara Menjalankan :

* Akses Project [Client-Feign](https://github.com/RizkiMufrizal/Simple-Feign-Consume-Rest-API/tree/master/Client-Feign) lalu jalankan perintah : `mvn clean spring-boot:run`
* Akses Project [Spring-Basic-Authentication](https://github.com/RizkiMufrizal/Simple-Feign-Consume-Rest-API/tree/master/Spring-Basic-Authentication) lalu jalankan perintah : `mvn clean spring-boot:run`

Spring-Basic-Authentication jalan di port : 8081
Client-Feign jalan di port : 8082

Silahkan akses `http://localhost:8082` maka akan redirect ke `http://localhost:8082/login`, silahkan masukkan : 

username : rizki, password : mufrizal

silahkan ubah username dan password di [WebSecurityConfiguration](https://github.com/RizkiMufrizal/Simple-Feign-Consume-Rest-API/blob/master/Spring-Basic-Authentication/src/main/kotlin/org/rizki/mufrizal/spring/basic/authentication/configuration/WebSecurityConfiguration.kt#L18)
