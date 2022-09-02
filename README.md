# spring-rabbitMQ
## Task
<img width="679" alt="Снимок экрана 2022-09-01 в 21 55 49" src="https://user-images.githubusercontent.com/85234616/187991318-1505f63f-4d88-4909-bc68-8d1d2a044d0a.png">

## Solution
Есть два Spring Boot проекта - Producer  и Consumer. 
В проекте Producer Telegram бот реагирует на тригерное сообщение и отправляет сообщение в очередь RabbitMQ. 
В проекте Consumer из очереди RabbitMQ будут обрабатыватся сообщения, и с помощью другого Telegram бота отправлятся соответсвующие уведомления. 

Структура проектов




Postman тесты

## Result

