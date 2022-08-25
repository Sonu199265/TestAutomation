const { Given, When, Then } = require('@wdio/cucumber-framework');
const assert = require('assert');
const { title } = require('process');

Given(/^I am on the login page$/, async () => {
    await browser.url("https://www.saucedemo.com/")
    console.log("My URL is: "+ browser.getUrl());


});

When(/^I login with a default user$/, async () => {
    await browser.$("#user-name").setValue("standard_user");
    await browser.$("#password").setValue("secret_sauce");
    await browser.$("#login-button").click();
    // const title = await browser.$(".title")
    // assert.equal(title, PRODUCTS, [Message])
   

});

Then(/^I shall be on the Flight Finder page$/, async () => {
    var strUrl = browser.getUrl();

    console.log("URL is:" + strUrl)
});