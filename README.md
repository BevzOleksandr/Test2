<h1>Структура проекта:</h1>
src
├── main
│   └── java
│       └── com.example.framework
│           ├── config          // Інтерфейси Owner (URL, timeouts)
│           ├── driver          // DriverFactory (Singleton/ThreadLocal)
│           ├── pages           // Page Objects (тільки локатори і дії)
│           │   ├── base        // Базові класи сторінок
│           │   └── components  // Спільні елементи (меню, хедери)
│           ├── models          // Data Models (Java 17 records)
│           └── utils           // Хелпери (Waiters, WindowManager)
└── test
    └── java
        └── com.example.tests
            ├── base            // BaseTest (Setup/Teardown)
            └── regression      // Самі тестові класи
