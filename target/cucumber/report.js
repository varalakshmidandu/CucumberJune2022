$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosBankAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality validation",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BankFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Scenario1"
    },
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on bank and cash button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on new account button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enters account title \"\u003caccount title\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enters description \"\u003cdescription\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User enters initialBalance \"\u003cinitialBalance\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User enters accountNumber \"\u003caccountNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters contactPerson \"\u003ccontactPerson\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters phone \"\u003cphone\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User enters internetBankingURL \"https://www.chasebank.com/\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "account title",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingURL"
      ],
      "line": 23,
      "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Checking \u0026 account",
        "checking",
        "$1250",
        "234567890",
        "Tom",
        "2345678901",
        "https://www.chasebank.com/"
      ],
      "line": 24,
      "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1814805799,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    },
    {
      "line": 3,
      "name": "@Scenario1"
    },
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@BankFeature"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on bank and cash button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on new account button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enters account title \"Checking \u0026 account\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enters description \"checking\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User enters initialBalance \"$1250\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User enters accountNumber \"234567890\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters contactPerson \"Tom\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters phone \"2345678901\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User enters internetBankingURL \"https://www.chasebank.com/\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewAccountStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 448747501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 3087420300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 3085905199,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountStepDefinition.user_click_on_signin_button()"
});
formatter.result({
  "duration": 774624801,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 13289599,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountStepDefinition.user_click_on_bank_and_cash_button()"
});
formatter.result({
  "duration": 3061760300,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountStepDefinition.user_click_on_new_account_button()"
});
formatter.result({
  "duration": 3247310700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Checking \u0026 account",
      "offset": 27
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_account_title(String)"
});
formatter.result({
  "duration": 3091836999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "checking",
      "offset": 25
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_description(String)"
});
formatter.result({
  "duration": 3092041701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1250",
      "offset": 28
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_initialBalance(String)"
});
formatter.result({
  "duration": 3098641200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "234567890",
      "offset": 27
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_accountNumber(String)"
});
formatter.result({
  "duration": 3076042699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 27
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_contactPerson(String)"
});
formatter.result({
  "duration": 3078378400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2345678901",
      "offset": 19
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_phone(String)"
});
formatter.result({
  "duration": 3085746200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.chasebank.com/",
      "offset": 32
    }
  ],
  "location": "NewAccountStepDefinition.user_enters_internetBankingURL(String)"
});
formatter.result({
  "duration": 3094743500,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountStepDefinition.user_click_on_submit_button()"
});
formatter.result({
  "duration": 514838100,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountStepDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "duration": 3073195300,
  "status": "passed"
});
});