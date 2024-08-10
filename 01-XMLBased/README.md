# XML-Based Configuration

### Create bean for non-arguments constructors
```xml
<bean id="instanceName" class="com.full.className" />
```

### Create Bean tag for Static Factory Method
```xml
<bean id="instanceName" class="com.full.className" factory-method="staticFactoryClassMethodName" />
```