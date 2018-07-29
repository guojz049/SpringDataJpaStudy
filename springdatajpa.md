# 配置说明
1. `persistence.xml`
```xml
	<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5Dialect"/>
```
该配置表示将`HQL`语句转换为何种的`SQL`方言语句。不同种类的数据库生成的`SQL`语句应该是不同的。

```xml
  <!--配置如何根据java模型生成数据库表结构,常用update,validate-->
	<property name="hibernate.hbm2ddl.auto" value="update"/>
```
- `update`：如果实体模型改变，系统在启动`Hibernate`时候，会检测到这些改变，将会相应的修改数据库表结构，使其与`Java`的实体模型保持一致。
- `validate`：如果实体模型改变，系统在启动`Hibernate`时候，会检测到这些改变，但是不会修改数据库表结构，不一致的话会抛出异常。。

