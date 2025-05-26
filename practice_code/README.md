# Getting Started

## My Learnings

### 1. Dependency Injection

There are three types of dependency injections.
- Field injection
    ```
    @Autowired
    private Laptop laptop;
    ```

- Constructor injection (recommended)
    ```
    Dev(Laptop laptop) {
    this.laptop = laptop;
    }
    ```

- Setter injection (recommended)
    ```
    @Autowired
    public void getLaptop(Laptop laptop) {
    this.laptop = laptop;
    }
    ```

### 2. Autowired

- This is an annotation which is used when a class needs to be imported by another class, for this the imported class must have the annotation ***@Component*** which will let the spring framework know that an object needs to be created inside the ***Iac*** container.

- It works on the basis of ***BiType*** meaning that it checks the name of the class for which Autowiring is used and based on the class/type name of the object it imports the class name.

### 3. Annotations like Primary and Qualifier

- Both of these are used with the presence of ***@Autowiring*** when there is a chance of a confusion occurring as which class to call for running the application.

- ***@Primary -*** in the example where both the Laptop and Desktop classes are implementing the Computer interface, then from any other class when one of them is required, Primary annotation should be used so that no confusion will be there for the spring framework as to which class needs to be imported.

- ***@Qualifier -*** another type of annotation works same as Primary, in case of confusion it will pickup the class which will be passed to it as an argument.
