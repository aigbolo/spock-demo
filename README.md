# spock-demo

**Good reasons to write test**

- **they’re checking if a code is working** — the most basic one, we write them to make sure that implementation of our code is working,
- **regression** — when we add new functionality or refactor an application we want to make sure that old features are working as previously,
- **help focus on the problem that needs to be resolved (TDD)** — most of developers likes to code. That’s not something new, but we sometimes, and I’m speaking also about myself, want to start coding it right away just right after when we get a new requirement. In general it’s a good thing that we have such passion in our work, but there could be situations when we think that we fully understand the requirements, but its not true. And that’s why the idea of writing tests first, before implementation (*Test Driven Development*, TDD), might help find those misunderstandings, because **first we need to think of what needs to be the expected outcome** before thinking of how we would like to achieve it,
- **documentation —** tests might be great, living documentation. They describe how an application works and make sure to keep it that way. To keep it that way they need to be written in a very simple way, so that even non-developers could read them, and that might be a challenge.
---

**Spock Framework VS JUnit**
**Star on Github**

`Spock 3.1k`  `JUnit5 5k`  

### **JUnit vs Spock Framework: What are the differences?**

**JUnit:** *A programmer-oriented testing framework for Java*. JUnit is a simple framework to write repeatable tests. It is an instance of the xUnit architecture for unit testing frameworks.
**Spock Framework:** *The Enterprise-ready testing and specification framework*. It is a testing and specification framework for Java and Groovy applications. What makes it stand out from the crowd is its beautiful and highly expressive specification language. It is compatible with most IDEs, build tools, and continuous integration servers.
JUnit and Spock Framework can be primarily classified as **"Testing Frameworks"** tools.

### **Spock learning curve**

Spock is a testing framework writing in Groovy. So that we can reference to groovy learing curve:

> ****Flat learning curve:****  Concise, readable and expressive syntax, easy to learn for Java developers
> 

### **Debugging  and Troubleshooting**

Groovy comes with a rather *powerful variant* of `assert` also known as *power assertion statement*. Groovy’s power `assert` differs from the Java version in its output given the boolean expression validates to `false`

``` groovy
def "one plus one should equal two"() {
    expect:
      1 + 1 == 3
}

// Output:

// Condition not satisfied:
// 1 + 1 == 3
//   |   |
//   2   false
```

---

**References:**

[https://blog.jetbrains.com/idea/2021/01/tutorial-spock-part-1-getting-started/](https://blog.jetbrains.com/idea/2021/01/tutorial-spock-part-1-getting-started/)
[https://stackshare.io/stackups/junit-vs-spock-framework](https://stackshare.io/stackups/junit-vs-spock-framework)
[https://blog.solidsoft.pl/2020/04/15/spock-vs-junit-5-the-ultimate-feature-comparison/](https://blog.solidsoft.pl/2020/04/15/spock-vs-junit-5-the-ultimate-feature-comparison/)
[https://groovy-lang.org/testing.html](https://groovy-lang.org/testing.html)
[https://medium.com/swlh/make-testing-fun-again-with-spock-framework-20b9b55ae699](https://medium.com/swlh/make-testing-fun-again-with-spock-framework-20b9b55ae699)
