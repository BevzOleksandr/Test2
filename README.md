## 📂 Структура проекта

```text
src
├── main
│   └── java
│       └── java.scrooge.framework
│           ├── config       // Інтерфейси Owner (URL, timeouts)
│           ├── driver       // DriverFactory (Singleton/ThreadLocal)
│           ├── models       // Data Models (Java 17 records)
│           ├── pages        // Page Objects (тільки локатори і дії)
│           │   ├── base         // Базові класи сторінок
│           │   └── components   // Спільні елементи (меню, хедери)
│           └── utils        // Хелпери (Waiters, WindowManager)
└── test
    └── java
        └── java.scrooge.tests
            ├── base         // BaseTest (Setup/Teardown)
            └── regression   // Самі тестові класи
