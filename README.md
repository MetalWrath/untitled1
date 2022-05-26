


Это тестовый сервис, который умеет работать с БД PostgreSQL.

by default поднимается на порту 8080 и имеет подключение к базе данных,
развернутой на VPS. 
----------------------------------------------------------------------
http-endpoints (по заданию):

GET /companies/{companyName} - получить одну компанию по имени ({companyName} - String.

GET /companies/ - получить все компании.

----------------------------------------------------------------------

http-endpoints (все):

GET /api/users - получить всех работников.

POST /api/users - сохранить работника(образец JSON'a см. в конце).

GET /api/users/{id} - получить конкретного работника по id(int).

DELETE /api/users/{id} - удалить конкретного работника по id(int).

GET /users/bycompany/{comp} - получить всех работников конкретной компании({comp} - String. Возможные варианты см. в конце).

GET /generate - генерирует 100 новых работников.

----------------------------------------------------------------------

GET /companies/{companyName} - получить одну компанию по имени ({companyName} - String. Возможные варианты см. в конце).

GET /companies/ - получить все компании.

POST /companies/ - создать компанию. Образец JSON'a см. в конце).

DELETE /companies/{companyName} - удалить одну компанию по имени ({companyName} - String. Возможные варианты см. в конце).

----------------------------------------------------------------------

Варианты параметра для {companyName}:
ARMTEK, SBER, ITEKO, AUTORUS, AG, BLACKWATER

----------------------------------------------------------------------

Образцы JSON'ов:

Для users:

{

"name":"TESTUSER",  // Имя пользователя, String(255), NOT NULL.

"company":"AG",     // Компания, варианты см. выше, String(100), NOT NULL.

"department":"AXO", // Департамент, String(10), NOT NULL.

"salary":93555,     // Зарплата, int, NOT NULL.

"sex":"MALE"        // Пол: MALE/FEMALE, NOT NULL.

}


Для company:

{

"name":"Example name",                // Наименование компании, String(255), NOT NULL.

"address":"Example address",          // Адрес компании, String(255).

"phoneNumber": 123456789,             // Номер телефона, int.

"weburl":"Example web-url"            // Адрес сайта, String(50).

}
