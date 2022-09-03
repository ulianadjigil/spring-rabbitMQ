# spring-rabbitMQ
## Task
<img width="679" alt="Снимок экрана 2022-09-01 в 21 55 49" src="https://user-images.githubusercontent.com/85234616/187991318-1505f63f-4d88-4909-bc68-8d1d2a044d0a.png">

## Solution
Запускаем RabbitMQ в Docker контейнере

~ docker pull rabbitmq:3-management

~ docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3-management

Есть два Spring Boot проекта - Producer  и Consumer. 
В проекте Producer Telegram бот реагирует на тригерное сообщение и отправляет сообщение в очередь RabbitMQ. 
В проекте Consumer из очереди RabbitMQ будут обрабатыватся сообщения, и с помощью другого Telegram бота отправлятся соответсвующие уведомления. 

## Result

<img width="367" alt="Снимок экрана 2022-09-03 в 16 31 18" src="https://user-images.githubusercontent.com/85234616/188272693-798516dd-06f4-49f1-8c45-f1b9fef9f504.png">
<img width="379" alt="Снимок экрана 2022-09-03 в 16 31 50" src="https://user-images.githubusercontent.com/85234616/188272718-050e02bd-ea5b-44d6-96b2-68f7b717b61c.png">
Поменять надписть в боте а то какая о странная фраза
