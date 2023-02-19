# spring-rabbitMQ
## Task
<img width="679" alt="Снимок экрана 2022-09-01 в 21 55 49" src="https://user-images.githubusercontent.com/85234616/187991318-1505f63f-4d88-4909-bc68-8d1d2a044d0a.png">

## Solution

Есть два Spring Boot проекта - Producer  и Consumer. 
В проекте Producer Telegram бот реагирует на тригерное сообщение и отправляет сообщение в очередь RabbitMQ. 
В проекте Consumer из очереди RabbitMQ будут обрабатыватся сообщения, и с помощью другого Telegram бота отправлятся соответсвующие уведомления. 

## Result

<img width="180" alt="Снимок экрана 2023-02-19 в 11 34 46" src="https://user-images.githubusercontent.com/85234616/219940252-6f1cd785-373b-4c08-a24b-47388b3b59ba.png">
