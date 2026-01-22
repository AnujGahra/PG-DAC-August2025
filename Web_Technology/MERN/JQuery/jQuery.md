## Introduction to jQuery
* The purpose of jQuery is to make it much easier to use JavaScript on your website.
* jQuery is a JavaScript library.
* jQuesry simplifies JavaScript programming.
* jQuery is easy to learn.

## What is jQuery?
* jQuery is lightweight open sourse "write less, do more" JavaScript library.
* The purpose of jQuery is to make it much easier to use JavaScript on your website.
* jQuery simplifies the interactions between HTML/CSS page and JavaScript.

## Why jQuery?
* There are lots of other JavaScript libraries, but the jQuery is the most popular amoing them and used by many big companies like --
* Google
* Microsoft
* Netflix
* IBM
* jQuery takes a lot of common tasks that requires many lines of JavaScript code to accomplish and wraps them into methods that you can call with a single line of code.
* It works anywhere. HTML5 is cross browser compatible- it will work on any browser, mobile or tablet, an even on Apple device.

## jQuery
* jQuery is a JavaScript library that came in 2006. It was created by John Resig to ease JavaScript Programming. After learning the concepts of jQuery, it will be easier for a developer to work with javaScript. it is a "Write less, do more " JavaScript library.
* jQuery ease javaScript code. The same code you run in javaScript with many lines can be easily worked with jQuery and lessened to a single line of code.

* Let us now see the features of Jquery

### Selectors
* Use the jQuery selectors to select an HTML element and manipulate it.
### Animation
* Animate a div or any other element with jQuery.
### CSS Manipulation
* Manipulate an element and apply CSS style to it with jQuery.
### jQuery Ajax
* JQuery has a rich set of AJAX methods for developing modern web applications.
### Event Methods
* Call event methods event objects with jQuery.
### jQuery Traversing
* jQuery provides DOM traversal methods to locate descendent elements, find sibling elements, etc.
### Plugins
* jQuery has many plugins such as for creating split pages, slideshow, progress bar, etc With that, you can also create your custom plugin.


## jQuery - Set Enviroment
#### We can set enviroment for jQuery using any of the following methods.
* **Method 1:** Download jQuery from the official website jquery.com
* **Method 2:** Directly use CDN i.e Content Delivery Network (faster).

### **Method 2: CDN for jQuery**
#### Follow the below given steps for method 2 and direcly use CDN an run jQuery:

Here are **clean, crisp, and well-formatted short notes** on **jQuery Selectors**— perfect for your `.md` file:

---

# jQuery Selectors — Short Notes

## ⭐ What Are jQuery Selectors?

jQuery selectors are used to **find and select HTML elements** so you can manipulate them easily (change text, apply CSS, hide/show elements, etc.).

They work similar to **CSS selectors**, but with jQuery’s powerful functions included.

---

## ⭐ Why Use jQuery Selectors?

* To **manipulate elements** dynamically
* To **apply animations, events, styles**
* To **access or update content** inside the DOM
* To **simplify JavaScript code** (short & readable)

---

## ⭐ Syntax

```js
$(selector).action();
```

* `$` → jQuery function
* `selector` → element you want to target
* `action()` → method to apply (e.g., hide, show, css)

---

## ⭐ Types of jQuery Selectors

### **1. Basic Selectors**

| Selector  | Example       | Description                |
| --------- | ------------- | -------------------------- |
| ID        | `$("#id")`    | Selects element by ID      |
| Class     | `$(".class")` | Selects element by class   |
| Tag       | `$("p")`      | Selects all `<p>` elements |
| Universal | `$("*")`      | Selects all elements       |

---

### **2. Hierarchy Selectors**

| Selector        | Example        | Description             |
| --------------- | -------------- | ----------------------- |
| Descendant      | `$("div p")`   | `<p>` inside `<div>`    |
| Child           | `$("ul > li")` | Direct child elements   |
| Sibling         | `$("h2 + p")`  | Next sibling            |
| General Sibling | `$("h2 ~ p")`  | All siblings after `h2` |

---

### **3. Attribute Selectors**

| Example              | Description                    |
| -------------------- | ------------------------------ |
| `$("[href]")`        | Elements with `href` attribute |
| `$("[type='text']")` | Attribute with specific value  |

---

### **4. Pseudo-class Selectors**

| Selector | Example        | Description         |
| -------- | -------------- | ------------------- |
| `:first` | `$("p:first")` | First `<p>` element |
| `:last`  | `$("p:last")`  | Last `<p>` element  |
| `:even`  | `$("tr:even")` | Even rows           |
| `:odd`   | `$("tr:odd")`  | Odd rows            |

---

## ⭐ How to Use jQuery Selectors — Example

### **Select by ID**

```js
$("#title").css("color", "blue");
```

### **Select by class**

```js
$(".box").hide();
```

### **Select all paragraphs**

```js
$("p").text("Updated!");
```

### **Select using attribute**

```js
$("input[type='email']").val("example@gmail.com");
```

---

If you want, I can also prepare
✅ jQuery Events notes
✅ jQuery Animation notes
✅ jQuery Traversing notes
for your `.md` file in the same format.
