
## Kotlin 소개

Kotlin은 JetBrains라는 회사에서 만들어진 프로그래밍 언어로, JVM에서 기반한 언어입니다. IntelliJ를 만든 회사에서 개발하였으며, 자바와 완벽하게 호환되면서도 더 간결한 특징을 가지고 있습니다.
<br>


### **Kotlin 장점**

1. **간결한 구문**: Kotlin의 구문은 Java에 비해 더 간결하고 표현력이 풍부하게 설계되어 있어 상용구 코드를 줄여 읽고 쓰기가 더 쉬워집니다.

2. **Null 안전성**: Kotlin은 null 허용 참조와 null 불가 참조를 구별하는 유형 시스템을 도입하여 널 포인터 예외를 방지하는 데 도움을 줍니다.

3. **상호 운용성**: Kotlin은 Java와 원활하게 작동하도록 설계되어 Java 코드를 호출하거나 그 반대로 호출하는 데 문제가 없습니다. 이는 Java에서 Kotlin으로 전환하거나 혼합 언어 환경에서 작업할 때 특히 유용합니다.

4. **함수형 프로그래밍**: Kotlin은 함수형 프로그래밍 기능을 지원하여 기능적이고 간결한 코드를 더 쉽게 작성할 수 있게 해줍니다.

5. **확장 함수**: Kotlin을 사용하면 소스 코드를 수정하지 않고도 기존 클래스에 새 함수를 추가할 수 있습니다. 이는 기존 API를 향상시키는 강력한 기능인 확장 함수를 사용하여 수행됩니다.

6. **스마트 캐스트**: Kotlin의 유형 시스템에는 유형 검사 후 자동으로 변수를 캐스트하는 스마트 캐스트가 포함되어 있어 코드에서 명시적인 캐스팅의 필요성이 줄어듭니다.

<br>

### **Kotlin 에서 출력**


Kotlin에서 출력을 할 때, Java와는 다르게 세미콜론(;)을 붙이지 않아도 됩니다. Kotlin에서의 출력 방식은 다음과 같습니다:
<br>



```java
println("Hello World") // 코틀린에서의 출력
```


```kotlin
System.out.println("Hello World"); // 자바에서의 출력
```


<br>
<br>

### **Kotlin에서 변수 선언** 

Kotlin에서 변수를 선언할 때는 `var`와 `val` 키워드를 사용합니다. 이 두 키워드는 변수의 수정 가능 여부를 나타냅니다.  Kotlin에서의 변수 선언 방식을 설명하겠습니다:

```java
long number1 = 10L; //long 타입 변수 선언

final long number2 = 10L; //final 선언

Long number3 = 1_000L; //객체 타입 선언

Person person = new Person("재롱이"); //클래스 선언

//<자바에서의 변수 선언>
```

<br>

```kotlin
fun main() {

    var number1 = 10L //변수 선언 (가변)

	number1 = 5L // 가능

    val number2 = 20L //변수 선언 (불변)

	number2 = 10L //불가능
}

//<코틀린에서의 변수 선언>
```

- `var`: 가변 변수를 선언합니다. 이 변수의 값은 언제든지 수정할 수 있습니다.
- `val`: 불변 변수를 선언합니다. 이 변수의 값은 한 번 초기화되면 수정할 수 없습니다. 재할당이 불가능합니다.

코틀린에서는 변수를 사용하기 전에 반드시 초기값을 할당해주어야 합니다. 또한, `val`을 사용하여 변수를 선언하면 해당 변수는 한 번만 초기화할 수 있습니다.

Kotlin에서의 변수 선언은 Java와 달리 명시적으로 수정 가능 여부를 표시하므로 코드의 가독성을 높이고 버그를 줄일 수 있습니다.

<br>

### **Kotlin 에서 연산자 관련**

Java와 Kotlin은 객체 동일성과 객체 동등성을 비교하는 데에 다른 연산자와 메서드를 사용합니다.

|   | 동일성 | 동등성 |
| ------ | -----  | ------ |
| 자바   | ==     | equals |
| 코틀린 |  ===    | ==     |


**Java:**

- 객체 동일성(Reference Equality)을 비교할 때는 `==` 연산자를 사용합니다.
- 객체 동등성(Structural Equality)을 비교할 때는 `equals` 메서드를 호출합니다.

**Kotlin:**

- 객체 동일성을 비교할 때는 `===` 연산자를 사용합니다.
- 객체 동등성을 비교할 때는 `==` 연산자를 사용합니다. 이 연산자는 내부적으로 `equals` 메서드를 호출합니다.

따라서 Kotlin에서 `==` 연산자를 사용하면 간접적으로 `equals` 메서드가 호출됩니다. Kotlin에서 이러한 방식을 통해 코드를 더 간결하게 유지하고 가독성을 높이며, 객체 동등성을 비교할 때 명시적으로 `equals`를 호출할 필요가 없습니다.

<br>

## **Kotlin 에서 타입 선언**

코틀린에서는 변수를 선언할 때 타입을 명시하거나, 초기값을 지정하여 변수를 생성할 수 있습니다. 아래는 코틀린에서의 타입 선언과 관련된 예제와 설명입니다:

```kotlin
var number3: Long = 30L // 타입과 값을 동시에 명시

var number4: Long // 초기값을 지정하지 않고 타입만 명시

var number5 //타입과 초기값을 모두 명시하지 않아 컴파일러가 타입을 추론할 수 없음

var number6: Int //초기값을 지정하지 않았으므로 사용할 수 없음
	
```

- 변수를 선언할 때 초기값을 함께 지정할 수 있으며, 이 경우 컴파일러는 변수의 타입을 추론합니다.
- 변수를 선언할 때 초기값을 지정하지 않고 타입만 명시하면, 나중에 초기값을 할당할 수 있습니다.
- 변수를 선언할 때 타입과 초기값을 모두 명시하지 않으면 컴파일러는 타입을 추론할 수 없으므로 에러가 발생합니다.
- 변수를 선언한 후 초기값을 지정하지 않으면 나중에 사용할 때 에러가 발생합니다.

코틀린에서는 변수를 사용하기 전에 초기값을 할당하거나 타입을 명시해주어야 하며, 초기값을 나중에 할당하려면 변수를 먼저 선언한 후에 할당해야 합니다.

<br>

### **Kotlin 에서의 기본 타입과 참조 타입**

```java
long number1 = 10L;

Long number3 = 1_000L;
```

```kotlin
var number1:Long =10L

var number3:Long =1_000L
```

Kotlin은 기본 타입과 참조 타입을 구분하지 않습니다. Java와는 다르게 Kotlin에서는 모든 데이터 타입이 참조 타입으로 취급됩니다. 그러나 Kotlin 컴파일러는 코드를 최적화하여 필요한 경우에 기본 타입(Primitive Type)으로 변환하여 성능을 향상시킵니다.

예를 들어, Kotlin에서 `Long` 타입 변수를 선언하고 값을 할당하면 내부적으로는 `long` (기본 타입)으로 처리됩니다. Kotlin은 이러한 타입 변환을 자동으로 처리하여 개발자가 명시적으로 타입을 변환할 필요가 없도록 합니다.

따라서 Kotlin에서는 기본 타입과 참조 타입을 명시적으로 구분하지 않고, 기본 타입의 특징과 참조 타입의 편리함을 함께 제공합니다. 이로 인해 코드 작성이 더 간결해지고 가독성이 향상되며, 동시에 성능을 유지할 수 있습니다.

<br>

### **Kotlin 에서의 null**

Kotlin은 기본적으로 null을 허용하지 않는 안전한 언어입니다. 변수가 null을 가질 수 있는 경우에는 해당 변수의 타입 뒤에 `?`를 붙여야 합니다. 아래는 예제와 설명입니다:

```kotlin
var number1 = 10L

// 아래 주석 처리된 코드는 에러를 발생시킵니다.
// var number3 = 1_000L
// number3 = null

var number: Long? = 1_000L
number = null // 이렇게 null을 할당할 수 있습니다.
```


- Kotlin에서는 변수를 선언할 때 기본적으로 null을 허용하지 않습니다.
- 변수가 null을 가질 수 있는 경우에는 타입 뒤에 `?`를 붙여야 합니다. 이렇게 하면 해당 변수에 null 값을 할당할 수 있습니다.

이러한 접근 방식은 Kotlin에서 안전한 null 처리를 촉진하며, `NullPointerException`을 줄이는 데 도움을 줍니다.

<br>


### **Kotlin 에서의 객체 인스턴스**

Kotlin에서 객체를 인스턴스화할 때는 `new` 키워드를 사용하지 않습니다. 다음은 Kotlin에서 객체를 생성하는 예제입니다:

```kotlin
var person= Person("김종훈")
```

Kotlin에서는 클래스의 생성자를 호출하여 객체를 생성할 수 있으며, `new` 키워드를 사용할 필요가 없습니다. 이렇게 코드를 작성하면 객체가 생성되고 초기화됩니다.

<br>

### **Kotlin 에서의 null 체크**

Kotlin에서는 기본적으로 타입에 null 값을 포함하지 않기 때문에, 타입 뒤에 `?`를 붙여 명시적으로 null을 허용하도록 해야 합니다. 아래는 Kotlin에서의 null 체크와 관련된 코드 예제입니다:

```kotlin
public boolean startsWithsWith1(String str) {  
  
if (str == null) {  
throw new IllegalArgumentException("Null이 들어왔습니다.")  
}  
return str.startsWith("A");  
}  
  
  
public Boolean startsWithsWith2(String str) {  
  
if (str == null) {  
return null;  
}  
return str.startsWith("A");  
}  
  
  
public boolean startsWithsWith3(String str) {  
  
if (str == null) {  
return false;  
}  
return str.startsWith("A");  
}
```
<자바에서 null 체크 방법>

<br>

```kotlin
fun startsWithsWith1(str: String?): Boolean {  
if (str == null) {  
throw IllegalArgumentException("Null이 들어왔습니다.")  
}  
return str.startsWith("A");  
}  

  
fun startsWithsWith2(str: String?): Boolean? {  
  
if (str == null) {  
return null;  
}  
return str.startsWith("A");  
}  


  
fun startsWithsWith3(str: String?): Boolean {  
  
if (str == null) {  
return false;  
}  
return str.startsWith("A");  
}
```

<코틀린에서 null 체크 관련 코드>

- Kotlin에서는 변수나 함수의 파라미터, 반환 값 등을 선언할 때 해당 값이 null을 허용하는지 여부를 `?`를 사용하여 명시적으로 표현해야 합니다.
- `str: String?`에서 `?`는 `str` 변수가 null일 수 있다는 것을 나타냅니다.
- `Boolean?`는 `Boolean` 타입이거나 null일 수 있는 값을 나타냅니다.
- 이러한 접근 방식은 Kotlin에서 안전한 null 처리를 강조하며 NullPointerException을 방지하는 데 도움을 줍니다.

<br>

### **Kotlin Safe Call 연산자**

```kotlin
val str: String? = "ABC"

// 아래 코드는 컴파일 에러를 발생시킵니다.
str.length // 불가능

// Safe Call 연산자를 사용하면, str이 null이 아닌 경우에만 length를 호출합니다.
val length = str?.length // 가능

// str이 null이면 length에는 null이 할당됩니다.
println(length) // 출력: null
```

- Safe Call 연산자(`?.`)를 사용하면 변수가 null인지 아닌지를 검사하고, null이면 연산을 중단하고 그대로 null을 반환합니다.
- Safe Call 연산자를 사용하면 코드가 더 안전하게 null 처리됩니다. 이를 통해 `NullPointerException`을 방지하고 안정성을 높일 수 있습니다.

Kotlin의 Safe Call 연산자는 nullable한 변수를 다룰 때 유용하게 사용되며, 안전한 코드 작성에 기여합니다.

<br>
### **Kotlin Elvis 연산자**

Kotlin에서 Elvis 연산자(`?:`)는 변수가 `null`인지 아닌지를 검사하고, 변수가 `null`이 아닌 경우 왼쪽 식을 실행하며, 변수가 `null`인 경우에는 오른쪽 식을 실행하는 연산자입니다. 아래는 Kotlin Elvis 연산자의 예제와 설명입니다:

```kotlin
val str: String? = "ABC"

// Elvis 연산자
//str이 null이 아니면 str.length를 반환하고, null이면 0을 반환합니다.
val length = str?.length ?: 0

println(length) // 출력: 3
```

- Elvis 연산자(`?:`)는 변수가 `null`인지 아닌지를 검사하고, 변수가 `null`이 아닌 경우 왼쪽 식을 실행합니다.
- 변수가 `null`인 경우에는 오른쪽 식을 실행하며, 그 결과를 반환합니다.

Kotlin의 Elvis 연산자는 변수가 `null`인 경우에 대한 기본 값을 설정할 때 유용하게 사용됩니다. 이를 통해 안전한 기본값 설정 및 코드의 가독성을 향상시킬 수 있습니다.

<br>
#### **Kotlin Safe Call과 Elvis 연산자 예시**

Kotlin에서 Safe Call(`?.`)과 Elvis(`?:`) 연산자를 함께 사용하여 예외 처리를 간결하게 할 수 있습니다.

```kotlin


fun startsWithsWith1(str: String?): Boolean {  
return str?.startsWith("A") ?: throw IllegalArgumentException("Null이 들어왔습니다.");  
}  
  
fun startsWithsWith2(str: String?): Boolean? {  
return str?.startsWith("A")  
}  
  
  
fun startsWithsWith3(str: String?): Boolean {  
return str?.startsWith("A") ?: false  
}

```

- `startsWithsWith1` 함수는 `str`이 `null`이면 예외를 던지고, 그렇지 않으면 `startsWith` 메서드를 호출하여 결과를 반환합니다.
- `startsWithsWith2` 함수는 `str`이 `null`이면 `null`을 반환하고, 그렇지 않으면 `startsWith` 메서드를 호출하여 결과를 반환합니다.
- `startsWithsWith3` 함수는 `str`이 `null`이면 `false`를 반환하고, 그렇지 않으면 `startsWith` 메서드를 호출하여 결과를 반환합니다.

Kotlin의 Safe Call과 Elvis 연산자를 함께 사용하면 예외 처리를 간결하게 할 수 있으며, 코드의 가독성을 향상시킬 수 있습니다.

<br>

### **Kotlin non-null 단정자**

Kotlin에서 Non-null 단정자(`!!`)는 변수에 할당된 값이 `null`이 아님을 확실히 단언하므로, 컴파일러가 null 검사를 수행하지 않도록 합니다. 그러나 만약 변수가 실제로 `null`이라면 `NullPointerException`이 발생합니다. 따라서 Non-null 단정자는 변수가 확실히 `null`이 아닌 경우에만 사용해야 합니다. 아래는 예제와 설명입니다:

```java
var str1: String? = null

// Non-null 단정자를 사용하여 str1이 null이 아님을 단언합니다.
var len = str1!!.length

// str1이 실제로 null이므로 아래 코드는 NullPointerException을 발생시킵니다.
println(len)
```

- Non-null 단정자(`!!`)를 사용하면 변수에 할당된 값이 확실히 `null`이 아님을 단언합니다.
- 그러나 Non-null 단정자를 사용할 때는 해당 변수가 실제로 `null`이 아닌 경우에만 사용해야 합니다.
- 변수가 `null`인 경우에 Non-null 단정자를 사용하면 `NullPointerException`이 발생합니다.

Kotlin에서 Non-null 단정자는 변수가 null이 아님을 확실히 알고 있을 때만 사용해야 하며, null 안전성을 보장하기 위해 주의해서 사용해야 합니다.
<br>
### **Java → Kotlin 변환 시 주의사항**

인텔리제이(IntelliJ IDEA)를 사용하여 Java 코드를 Kotlin으로 변환할 때, 주의해야 할 몇 가지 사항이 있습니다. 특히, null 관련 정보가 없는 경우에 대한 변환에 주의해야 합니다. 아래는 Java에서 Kotlin으로의 변환 시 주의사항과 설명입니다:

1. **@Nullable 및 @NonNull 어노테이션 처리:** Java 코드에 `@Nullable` 또는 `@NonNull`과 같은 어노테이션을 사용하여 null 관련 정보를 나타내고 있다면, Kotlin으로 변환될 때 `?` 또는 `!!`를 적절하게 사용합니다. 예를 들어, `@Nullable`이 있는 필드는 Kotlin에서 nullable한 타입으로 변환될 것이며, `@NonNull`이 있는 필드는 non-null 타입으로 변환될 것입니다.
    
2. **자바에서는 기본 타입:** Java에서 사용되는 기본 타입(예: `int`, `boolean`)은 Kotlin에서 자동으로 Kotlin 기본 타입으로 변환됩니다. 따라서 필요한 경우 Kotlin 기본 타입을 사용하고, null 처리를 위해 기본 타입을 nullable로 선언해야 하는 경우 `?`를 추가해야 합니다.
    
3. **컬렉션 타입 변환:** Java에서 Kotlin으로 변환할 때, 컬렉션 타입도 자동으로 변환됩니다. Java의 `List`는 Kotlin에서 `List`로 유지되며, `Map`은 `Map`으로 변환됩니다.
    
4. **Getter 및 Setter 메서드 변환:** Java의 Getter와 Setter 메서드는 Kotlin의 프로퍼티로 변환됩니다. 따라서 필드에 직접 접근하는 대신 프로퍼티를 사용하게 됩니다.
    
5. **스태틱 멤버 변환:** Java의 `static` 멤버는 Kotlin의 `companion object`로 변환됩니다.
    
6. **컴파일러 경고:** Java에서 Kotlin으로의 변환 후 컴파일 시 경고가 발생할 수 있습니다. 이는 Java와 Kotlin의 차이로 인해 발생할 수 있으며, 경고를 해결하기 위해 코드를 수정해야 할 수 있습니다.
    
7. **Kotlin의 null 안전성 이점 활용:** Kotlin은 null 안전성을 강조하는 언어이므로, Java 코드를 Kotlin으로 변환할 때 null 처리에 주의를 기울여야 합니다. Nullable 타입을 올바르게 다루고, Elvis 연산자 및 Safe Call 연산자를 활용하여 NullPointerException을 방지할 수 있습니다.
    

변환된 Kotlin 코드를 검토하고 필요한 경우 null 관련 정보를 추가하고, 안전성을 확보하기 위한 수정을 수행해야 합니다. 코드 변환은 자동화될 수 있지만, 완벽한 변환을 위해서는 수동으로 일부 수정이 필요할 수 있습니다.
<br>
### **Kotlin 기본 타입 변환**

Kotlin에서는 타입 변환을 위해 `to변환타입()` 형식의 함수를 사용합니다. 변수가 `null` 값을 가질 수 있는 경우, 변환 시에 적절한 처리를 해야 합니다. 아래는 Kotlin에서의 기본 타입 변환과 null 처리에 관한 예제와 설명입니다:

```kotlin

val number1 = 3 // Int로 선언됩니다.
val number2: Long = number1.toLong()

val number3: Int? = 3 // Nullable한 Int로 선언됩니다.
val number4: Long = number3?.toLong() ?: 0L
```

- `number1`은 선언 시 타입이 지정되지 않았지만, 기본적으로 `Int`로 처리됩니다.
    
- `number2`는 `number1`을 `toLong()` 함수를 사용하여 `Long`으로 변환한 결과입니다.
    
- `number3`는 `Int?`로 선언되어 Nullable한 Int 값을 가집니다.
    
- `number4`는 Safe Call 연산자(`?.`)와 Elvis 연산자(`?:`)를 사용하여 `number3`을 `Long`으로 변환하며, 값이 `null`인 경우 0L로 기본값을 설정합니다.


Kotlin에서는 타입 변환과 null 처리를 안전하게 다룰 수 있도록 다양한 기능을 제공하며, 코드 안정성을 높일 수 있습니다.

<br> 

### **Kotlin 타입 캐스팅**

Kotlin에서 타입 캐스팅은 `is`와 `as` 연산자를 사용하여 수행합니다. 아래는 Kotlin에서의 타입 캐스팅과 스마트 캐스트에 관한 예제와 설명입니다:

```kotlin

//1.자바에서의 타입 캐스팅
public static void printAgeIfPersion(Object obj){
if(obj instanceof Person){
		Person person  = (Person) obj;
		System.out.println(person.getAge());
	}
}

//2.코틀린에서의 타입 캐스팅
fun prinAgeIfPerson(obj:Any){
	if(obj is Person){
			val person = obj as Person
			println(person.age)
	}
}

//2번 코틀린 코드를 스마스 캐스팅을 통해서 생략한 코드

fun prinAgeIfPerson(obj:Any){
	if(obj is person){
		println(obj.age)
	}
}

//2번 코틀린 코드에 null이 들어올수 있을 때
fun prinAgeIfPerson(obj:Any?){
	if(obj is person){
		val person = obj as? person
			println(person?.age)
	}
}
```

- `is` 연산자를 사용하여 객체의 타입을 체크할 수 있습니다. `obj is Person`은 `obj`가 `Person` 타입인지를 검사합니다.
- `as` 연산자를 사용하여 객체를 원하는 타입으로 캐스팅할 수 있습니다. `val person = obj as Person`은 `obj`를 `Person` 타입으로 변환합니다.
- `as?`를 사용하여 안전한 타입 캐스팅을 수행할 수 있습니다. `val person = obj as? Person`은 `obj`를 `Person` 타입으로 변환하며, 만약 실패하면 `null`을 반환합니다.

스마트 캐스트는 Kotlin의 강력한 기능 중 하나로, 타입 체크 이후에 자동으로 객체를 원하는 타입으로 변환해주어 코드를 간결하게 만듭니다.

<br>
### **Kotlin에서만 존재하는 Type**

Kotlin은 Java와 달리 몇 가지 고유한 타입을 제공합니다. 이러한 타입은 Kotlin의 특징을 이해하고 코드를 더 명확하게 작성하는 데 도움을 줍니다.

1. **Any**
    - `Any`는 Kotlin의 최상위 타입으로, 모든 객체의 부모입니다.
    - 모든 기본 타입(`Primitive Type`)의 최상위 타입도 `Any`입니다. 따라서 `long`과 `Long`을 구분하지 않습니다.
    - `Any` 자체로는 `null`을 포함할 수 없습니다. `null`을 포함하려면 `Any?`로 표현합니다.
    - `Any`에는 `equals`, `hashCode`, `toString` 등의 메서드가 존재합니다.
2. **Unit**
    - `Unit`은 Java의 `void`와 동일한 역할을 합니다. Kotlin에서는 타입 추론이 가능하므로 함수의 반환 타입으로 `Unit`을 생략할 수 있습니다.
    - `void`와 달리 `Unit`은 그 자체로 타입 인자로 사용 가능합니다.
    - 함수형 프로그래밍에서 `Unit`은 단 하나의 인스턴스만을 갖는 타입을 의미하며, 실제로 존재하는 타입입니다.
3. **Nothing**
    - `Nothing`은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 데 사용됩니다.
    - 주로 예외를 던지는 함수나 무한 루프를 가진 함수 등에서 활용됩니다.
    - `Nothing`은 함수가 예외를 던지거나 무한 루프에 빠지기 때문에 함수의 반환 타입으로 사용됩니다.

Kotlin은 이러한 고유한 타입을 활용하여 코드를 더 간결하고 안전하게 작성할 수 있도록 도와줍니다.

<br>

## **Kotlin 조건문**


### **Kotlin 조건문 예시**

```kotlin
fun main(){
    var a = 7
    if(a > 6){
        println(a)
    } else{
        print("exit")
    }
}

출력:
7
```

- Kotlin의 `if` 조건문은 Java와 유사하게 동작합니다.
- 조건식이 참인 경우 `if` 블록이 실행되고, 거짓인 경우 `else` 블록이 실행됩니다.
- Kotlin에서는 블록 내의 마지막 표현식이 해당 블록의 결과값으로 자동으로 반환되므로 `return` 키워드를 사용하지 않아도 됩니다.

Kotlin의 조건문은 Java와 비슷하게 사용할 수 있으며, Kotlin의 표현력 있는 문법을 활용하여 더 간결하고 가독성 있는 코드를 작성할 수 있습니다.

<br>

### **Kotlin에서의 조건문과 반환**

Kotlin에서는 `if` 조건문을 표현식으로 사용하여 더 간결하게 코드를 작성할 수 있습니다. 아래는 예제와 설명입니다:

```kotlin
// 기존 방식
fun getPassOrFail(score: Int): String {  
    if (score >= 50) {  
        return "P"  
    } else {  
        return "F"  
    }  
}
```
<br>

```kotlin
// Kotlin에서의 간결한 방식
fun getPassOrFail(score: Int): String {  
    return if (score >= 50) {  
        "P"  
    } else {  
        "F"  
    }  
}
```

- Kotlin에서는 `if` 조건문을 표현식으로 사용할 수 있습니다. 이는 조건식의 결과에 따라 `if` 블록 또는 `else` 블록 중 하나가 반환됩니다.
- 함수에서 `if` 표현식을 직접 반환할 수 있으므로, `return` 키워드를 사용하지 않고 간결하게 코드를 작성할 수 있습니다.
- Kotlin에서는 삼항 연산자가 없습니다. 대신 `if` 표현식을 활용하여 값을 반환합니다.

Kotlin의 `if` 표현식을 적극적으로 활용하면 코드를 간결하게 유지할 수 있으며, Java와 비교하여 가독성이 향상됩니다.

<br>

### **Kotlin에서의 조건문과 범위 표현**


```java
//자바에서의 조건문
public void validateScoreIsNotNegative(int score){  
if(0 <= score && score <= 100){  
	  // 범위 내의 값일 때 처리
	}  
}
```




```kotlin
//코틀린에서의 조건문
fun validateScoreIsNotNegative(score: Int) {  
    if (score in 0..100) {  
        // 범위 내의 값일 때 처리
    }  
}

```

- Kotlin에서는 `in` 연산자를 사용하여 범위를 표현할 수 있습니다. `0..100`은 0부터 100까지의 범위를 나타냅니다.
- 조건문을 간결하게 표현할 수 있으며, 가독성이 높아집니다.
- 범위 내에 속하는 값을 검사할 때 사용합니다. `score`가 0부터 100 사이인지 여부를 간단하게 확인할 수 있습니다.

Kotlin의 범위 표현은 코드를 더 직관적으로 만들어주므로 다양한 상황에서 활용할 수 있습니다.

<br>

### **Kotlin에서의 `when` 표현식**

```kotlin
when (조건을검사할 값) {

    case1 -> 동작1
    case2 -> 동작2
    else -> 동작3
}
```

- `when`은 Kotlin의 다양한 조건 처리를 위한 표현식입니다.
- 조건을 검사할 값이 `when` 키워드 뒤에 위치하며, 이 값이 각 분기에서 비교됩니다.
- 여러 개의 분기 조건문을 지원하며, 다양한 타입의 데이터를 비교할 수 있습니다.

Kotlin의 `when` 표현식은 간결하면서도 다양한 상황에서 활용할 수 있으며, 코드의 가독성을 높이는데 도움이 됩니다.

<br>

#### **Kotlin `when` 표현식의 다양한 활용 예시**

```kotlin
  
fun getGradeWithSwitch(score: Int): String {  
	return when (score / 10) {  
	9 -> "A"  
	8 -> "B"  
	7 -> "C"  
	else -> "D"  
	}  
}  
  
  
fun getGradeWithSwitch2(score: Int): String {  
	return when (score) {  
	in 90..99 -> "A"  
	in 80..89 -> "B"  
	in 70..79 -> "C"  
	else -> "D"  
	}  
}  
  
fun judgeNumber(score: Int) {  
	when (score) {  
	in -1..1 -> println("-1 , 0, 1에 속하는 숫자입니다.")  
	else -> println("아닙니다")  
	}  
}  
  
  
fun judgeNumber2(score: Int) {  
	when {  
	score == 0 -> println("주어진 숫자는 0입니다.")  
	score % 2 == 0 -> println("주어진 숫자는 짝수입니다.")  
	else -> println("주어진 숫자는 홀수입니다.")  
	}  
}

```

- 첫 번째 `when` 예시에서는 `score`를 10으로 나눈 결과에 따라 학점을 반환합니다.
- 두 번째 `when` 예시에서는 `score`가 범위에 따라 학점을 반환합니다.
- 세 번째 `when` 예시에서는 `score`가 범위에 따라 주어진 숫자에 속하는지 여부를 판단합니다.
- 네 번째 `when` 예시에서는 `score`의 조건에 따라 주어진 숫자의 특성을 출력합니다.

Kotlin의 `when` 표현식은 다양한 상황에서 조건을 처리하고 코드를 간결하게 유지하는 데 도움이 됩니다.

<br>

#### **Kotlin `when` 표현식의 값 비교 예시**

```kotlin
fun main() {
    val x = 5// 처음 x값에 5를 할당한다.

	when (x) { //when 문에서 x가 무슨 값을 가지느냐에 따라 결과가 달라진다.
    	1 -> println("x는 1이다")  //만약 x가 1일 경우, 'x는 1이다'가 출력된다. 
    	2, 3 -> println("x는 2 또는 3이다")//x가 2나 3일 경우, 
    	in 4..10 -> println("x는 4와 10 사이에 있다")//4부터 10까지의 범위에 속하는경우
    	else -> println("x는 다른 수이다")//모든 조건에 해당하지 않는 경우
	}
}
```

[출력결과]

```kotlin
x는 4와 10 사이에 있다
```

- 이 예시에서는 `when` 문을 사용하여 변수 `x`의 값에 따라 다른 결과를 출력합니다.
- `when`의 조건 중 하나에 해당하는 경우 해당 결과가 출력됩니다.
- `in` 키워드를 사용하여 범위에 속하는지 확인할 수 있습니다.
- `else` 블록은 모든 조건에 해당하지 않는 경우에 실행됩니다.

Kotlin의 `when` 표현식을 사용하면 다양한 조건을 처리할 수 있으며 코드를 간결하게 유지할 수 있습니다.

<br>

#### when **타입 비교**

다음 코드에서는 `when` 문을 사용하여 변수의 타입을 비교합니다.

```kotlin
fun main() {
    val data: Any = "Hello, World!"

    when (data) {
        is String -> println("data is a String: $data")
        is Int -> println("data is an Int: $data")
        is Boolean -> println("data is a Boolean: $data")
        else -> println("data is something else: $data")
    }
}
```

[출력결과]

```kotlin
data is a String: Hello, World!
```

- `data` 변수는 `Any` 타입으로 선언되어 다양한 타입의 값이 할당될 수 있습니다.
- 현재는 "Hello, World!"라는 문자열이 `data`에 할당되어 있습니다.
- `when` 문은 `data` 변수의 타입을 확인하고 분기 처리합니다.
- `is` 키워드를 사용하여 변수의 타입을 확인합니다.
- 만약 `data`의 타입이 `String`이면 "data is a String: Hello, World!"가 출력됩니다.
- 만약 `data`의 타입이 `Boolean`이면 "data is a Boolean: Hello, World!"가 출력됩니다.
- 위 코드는 `data` 변수가 `String` 타입이기 때문에 "data is a String: Hello, World!"가 출력됩니다.


<br>


## **Kotlin 배열**


<br>

### **배열 예시**

```kotlin
fun main() {

    // Int형으로 1, 2, 3, 4 배열 생성
    val intArr: Array<Int> = arrayOf(1, 2, 3, 4)

    // 타입 생략 가능
    val intArr2 = arrayOfNulls<Int>(5)

    // Any는 모든 데이터 타입을 포함할 수 있는 최상위 타입
    val anyArr: Array<Any> = arrayOf(1, "awd", 3.2, 4)

    println(intArr[0]) // 1 출력
    println(intArr2[1]) // null 출력
    println(anyArr[1]) // "awd" 출력
}

출력
1
null
awd

```

- Kotlin에서 배열은 `Array` 클래스를 사용하여 생성합니다.
- 배열의 요소 타입은 `<Type>` 형식으로 명시합니다. 예를 들어, `Array<Int>`는 `Int` 타입의 배열을 나타냅니다.
- 요소의 타입을 생략할 수 있으며, Kotlin은 컴파일러를 통해 타입을 추론합니다.
- `arrayOfNulls` 함수를 사용하여 지정된 크기의 null로 초기화된 배열을 생성할 수 있습니다.
- `Any`는 모든 데이터 타입을 포함할 수 있는 최상위 타입으로, 배열에 다양한 타입의 요소를 포함할 수 있습니다.

Kotlin에서 배열을 사용할 때 자바와 비슷한 문법을 사용하지만, 타입 추론과 표현력 있는 문법을 활용하여 코드를 간결하게 작성할 수 있습니다.

<br>

## **Kotlin 반복문**

<br>


### **`for-each` 문 예시**

```kotlin

val numbers = listOf(1, 2, 3)  
  
for (i in numbers) {  
	println(numbers)  
}

```

- Kotlin에서 `for-each` 루프는 `in` 키워드를 사용하여 구현됩니다.
- 위 예시에서는 `numbers` 리스트의 각 요소를 반복하며 각 요소를 `number` 변수에 할당하여 출력합니다.
- 이것은 자바의 `for-each`와 유사한 방식으로 작동합니다.

Kotlin의 `for-each` 문을 사용하면 반복 작업을 보다 간편하게 수행할 수 있습니다.

<br>

### **기본 `for` 문**

```kotlin
for(i: Int in 1..10)
    print(i)
```

- Kotlin에서 기본 `for` 문은 `in` 키워드를 사용하여 범위를 지정하여 반복을 수행합니다.
- 위 예시에서는 1부터 10까지의 범위에서 `i` 변수를 반복하며 각 값을 출력합니다.

`for` 문은 기본적으로 1씩 증가하며 반복합니다. 그러나 `step` 키워드를 사용하여 증가 단계를 지정할 수 있습니다. 이를테면,  2씩 증가하고 싶다면 다음과 같이 작성할 수 있습니다:

<br>

### **변수를 이용한 Kotlin `for` 문**

```kotlin
val len: Int = 10
for(i in 1..len)
    print(i)
```


- Kotlin에서는 변수를 사용하여 반복문을 작성할 수 있습니다.
- 위 예시에서는 `len` 변수에 10을 할당하고, `for` 문에서 1부터 `len`까지의 범위를 반복하며 각 값을 출력합니다.

변수를 사용하여 반복 범위를 동적으로 설정할 수 있어 유연한 반복 작업을 수행할 수 있습니다.

<br>

### **`until`을 이용한 Kotlin `for` 문**

```kotlin
for(i in 1 until len) //len이 10이므로 1부터 9까지 반복
    print(i)
```


- Kotlin에서 `until` 키워드를 사용하면 마지막 숫자 전까지의 범위를 반복할 수 있습니다.
- 위 예시에서는 `len` 변수가 10이므로 1부터 9까지의 범위에서 `i` 변수를 반복하며 각 값을 출력합니다.

`until`을 사용하면 마지막 숫자를 포함하지 않고 범위를 반복할 수 있으므로 유용합니다.

<br>

### **`step`을 이용한 Kotlin `for` 문**

```kotlin
for (i: Int in 1..10 step 2) // 1, 3, 5, 7, 9
    print(i)

for (i in 10 downTo 1 step 1) // 10부터 1까지 역순으로 출력
    print(i)

```

- Kotlin에서 `step` 키워드를 사용하면 증가 값을 설정할 수 있습니다.
- 첫 번째 예시에서는 1부터 10까지 2씩 증가하는 범위에서 `i` 변수를 반복하며 홀수를 출력합니다.
- 두 번째 예시에서는 `downTo` 키워드를 사용하여 10부터 1까지 1씩 감소하는 역순 범위에서 `i` 변수를 반복하며 출력합니다.

`step`을 사용하여 원하는 증가 값을 설정하거나 역순으로 반복하는 것이 가능합니다.

<br>
### **`downTo`를 이용한 Kotlin `for` 문**

```kotlin
for(i in 10 downTo 1) // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    print(i)

for(i in 10 downTo 1 step(2)) //10, 8, 6, 4, 2
    print(i)
```

- Kotlin에서 `downTo` 키워드를 사용하면 역순으로 반복할 수 있습니다.
- 첫 번째 예시에서는 10부터 1까지 역순으로 `i` 변수를 반복하며 출력합니다.
- 두 번째 예시에서는 `step` 키워드를 사용하여 2씩 감소하면서 역순으로 반복하는 예시입니다.

`downTo`를 사용하면 역순으로 반복할 수 있으며, `step`을 함께 사용하여 증가폭을 조절할 수도 있습니다.

<br>


### **배열과 리스트를 사용한 for문**


<br>


#### **배열을 탐색하는 Kotlin `for` 문**

```kotlin
val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5) //배열 선언

for(i in arr){
    print(i)
}
```

- Kotlin에서 배열을 사용하여 `for` 문을 사용할 때, 배열의 각 요소를 순서대로 탐색하며 작업을 수행할 수 있습니다.
- 위의 예시에서는 정수 배열 `arr`을 선언하고, `for` 문을 사용하여 배열의 각 요소를 출력하는 예시입니다.
- 
<br>
#### **배열을 거꾸로 탐색하는 Kotlin `for` 문**

```kotlin
for(i in arr.reversed()){
    print(i)
}
```

- Kotlin에서 배열을 거꾸로 탐색하려면 `reversed` 함수를 사용합니다.
- 위의 예시에서는 정수 배열 `arr`을 거꾸로 탐색하며 각 요소를 출력하는 예시입니다.

<br>

#### **인덱스와 원소 값을 함께 사용하는 Kotlin `for` 문**

```kotlin
val nameArr: Array<String> = arrayOf("Kim", "Lee", "Park") //배열 선언

    for((index, name) in nameArr.withIndex()){
        println("${index+1}번째 성은 ${name}입니다.")
    }
```

- Kotlin에서는 `withIndex()` 함수를 사용하여 배열의 인덱스와 해당 요소 값을 함께 사용할 수 있습니다.
- 위의 예시에서는 문자열 배열 `nameArr`을 순회하면서 각 성(요소)과 해당 성의 인덱스를 출력하는 예시입니다.

<br>

#### **리스트를 사용한 Kotlin `for` 문**

```kotlin
val list : List<String> = listOf("a", "b", "c") //리스트 선언

for(i in list){
    print(i)
}
```

- Kotlin에서는 리스트를 사용하여도 배열과 동일하게 `for` 문을 사용할 수 있습니다.
- 위의 예시에서는 문자열 리스트 `list`를 순회하면서 각 요소를 출력하는 예시입니다.

<br>

#### **count를 사용한 Kotlin `for` 문**

```kotlin
for(i in 0 until list.count()){
    print(list[i])
}
```

- Kotlin에서는 리스트의 길이를 `list.size`를 사용하여 `for` 문으로 탐색할 수 있습니다.
- 위의 예시에서는 문자열 리스트 `list`의 길이를 사용하여 각 요소를 출력하는 예시입니다.

<br>

### **while 문**


<br>

#### **while문**

```kotlin
var a: Int = 1
while(a <= 10){
    print("${a++} ") //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
}
```

- `while` 문은 조건을 먼저 검사하고 조건이 참일 때 루프를 실행합니다.
- 변수 `a`가 1부터 시작하고, 조건 `a <= 10`이 참일 동안 반복하여 `a`의 값을 출력하고 1씩 증가시킵니다. 결과적으로 1부터 10까지의 숫자가 출력됩니다

<br>

#### **do-while문**

```kotlin
var b: Int = 10
do{
    print("${b--} ")    //10, 9, 8, 7, 6, 5, 4, 3, 2, 1
}while(b > 0)
```

- `do-while` 문은 일단 루프를 한 번 실행한 다음에 조건을 검사합니다. 따라서 조건이 거짓이더라도 최소 한 번은 루프가 실행됩니다.
- 변수 `b`가 10부터 시작하고, 조건 `b > 0`이 참일 동안 반복하여 `b`의 값을 출력하고 1씩 감소시킵니다. 결과적으로 10부터 1까지의 숫자가 출력됩니다.


<br>

## **Kotlin 함수 (Functions)**

함수는 코드를 모듈화하고 재사용 가능한 블록 단위로 그룹화하는 데 사용됩니다. Kotlin에서 함수를 선언하려면 `fun` 키워드를 사용하며, 일반적으로 다음과 같은 구조를 가집니다:


```kotlin

fun functionName(parameters: ParameterTypes): ReturnType {
    // 함수 본문
    // 실행될 코드
    return result // 함수가 반환하는 값 (optional)
}


```

여기에서 설명을 나눠보겠습니다:

- `fun`: Kotlin에서 함수를 선언하기 위한 키워드입니다.
- `functionName`: 함수의 이름을 지정하는 부분입니다. 함수 이름은 식별자 규칙을 따라야 합니다.
- `parameters`: 함수의 입력 매개변수(파라미터)를 나타내며, 필요한 경우 여러 개의 파라미터를 콤마로 구분하여 선언할 수 있습니다.
- `ParameterTypes`: 각 파라미터의 데이터 타입을 나타냅니다.
- `ReturnType`: 함수가 반환하는 값의 데이터 타입을 나타냅니다. 함수가 값을 반환하지 않는 경우 `Unit` 타입을 사용하거나 반환 타입을 생략할 수 있습니다.
- 함수 본문: 중괄호 `{}` 안에 함수의 동작을 정의하는 부분으로, 실행될 코드 블록을 포함합니다.
- `return result`: 함수가 값을 반환할 때 사용되며, 필요한 경우 값을 반환할 수 있습니다. 반환 값은 함수의 `ReturnType`과 일치해야 합니다.

 
<br>

#### **return 단순화**

```kotlin
fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}
```

`max()` 함수는 두 개의 정수 `a`와 `b`를 입력으로 받아 더 큰 값을 반환합니다. 하지만 이 함수의 본문은 단순한 if-else 표현식을 사용하고 있어 불필요한 로컬 변수 선언이 있습니다.

<br>

####  **`{}`를 `=`로 변환**

```kotlin
fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }
```


위의 코드는 `max()` 함수를 더 간결하게 표현하는 방법을 보여줍니다. 중괄호(`{}`) 블록 대신 할당 연산자(`=`)를 사용하여 함수의 본문을 표현하고, 이 본문에서 `if-else` 표현식을 사용하여 두 수 중 더 큰 값을 반환합니다.

<br>

#### **반환 타입 생략**

```kotlin
fun max(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }
```

`=` 을 쓰게 되면 반환 타입도 생략 가능합니다. Kotlin은 표현식의 결과를 통해 반환 타입을 추론할 수 있습니다.

<br>

#### **중괄호 생략**

```kotlin
fun max(a: Int, b: Int) = if (a > b) a else b
```

중괄호 `{}` 또한 다 생략 가능하며, 위의 코드처럼 한 줄로 표현할 수 있습니다. 이때 중괄호가 생략되면 반환 타입이 unit(자바로 치면 void)가 아니면 명시적으로 작성해야 합니다.

이렇게 Kotlin에서는 함수를 더 간결하게 선언하고 사용할 수 있습니다.


<br>


### **Default Parameter**

디폴트 파라미터(Default Parameter)는 Kotlin에서 함수를 선언할 때 매개변수에 기본값을 지정하는 방법을 제공합니다. 이를 통해 함수를 호출할 때 일부 매개변수를 생략하고, 기본값이 설정된 매개변수만 사용할 수 있습니다.

예시를 통해 Default Parameter를 설명한 내용을 수정하여 보겠습니다:

```kotlin
//파라미터에 값을 지정
fun repeat(string: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(string)
        } else {
            print(string)
        }
    }
}
```

위의 코드에서 `repeat` 함수는 세 개의 매개변수를 가지고 있습니다. 그 중 `num`과 `useNewLine` 매개변수에는 기본값이 지정되어 있습니다. 이렇게 매개변수에 기본값을 지정하면 함수를 호출할 때 해당 매개변수를 생략할 수 있습니다.

예를 들어, 아래와 같이 함수를 호출할 수 있습니다:

```kotlin
repeat("Hello") // num은 기본값 3, useNewLine은 기본값 true를 사용
```

기본값이 지정된 매개변수에 대해서는 호출 시 값을 제공하지 않으면 기본값이 사용되며, 필요한 경우에만 값을 지정하여 함수를 호출할 수 있습니다.

<br>

### **Argument Parameter**

Kotlin에서는 함수 호출 시 매개변수의 이름을 지정하여 Argument Parameter를 지정할 수 있습니다. 이를 통해 기본값을 변경하고자 하는 매개변수만 선택적으로 설정할 수 있습니다.

예를 들어, 아래와 같이 `repeat` 함수를 호출하여 `num`은 그대로 3을 사용하고, `useNewLine`은 `false`로 변경하고 싶다면 다음과 같이 Argument Parameter를 사용할 수 있습니다:

```kotlin
repeat("hello", useNewLine =  false)
```

이와 같이 Argument Parameter를 사용하면 함수 호출 시 명확하게 어떤 매개변수에 값을 할당하는지 지정할 수 있어 코드의 가독성을 높일 수 있습니다.

단, Kotlin에서 Java 함수를 사용할 때는 이러한 기능을 사용할 수 없으며, Java 함수의 매개변수 순서대로 값을 전달해야 합니다.


<br>


### **가변 인자가 있는 함수**

가변 인자 함수는 Kotlin에서 간단하게 선언할 수 있으며, 호출 시에도 간편하게 사용할 수 있습니다.

Kotlin에서 가변 인자 함수를 선언할 때에는 매개변수 앞에 `vararg` 키워드를 사용하여 표시합니다. 이를 통해 함수 내에서 가변 개수의 인자를 배열로 다룰 수 있게 됩니다.

예를 들어, 아래와 같이 `printAll` 함수를 선언할 수 있습니다:


#### **Kotiln에서 가변 인자 함수 선언할 때**

```kotlin

val array = arrayOf("A", "B", "C")
printAll(*array)
	
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}


//vararg 가 가변 인자임을 표시해주는 키워드이다.

```

그리고 가변 인자 함수를 호출할 때는 배열을 직접 넘기는 대신 스프레드 연산자(`*`)를 사용하여 간단하게 값을 전달할 수 있습니다. 

<br>

## **Kotlin에서의 클래스**

Kotlin에서 클래스를 선언하는 방법과 자바에서의 클래스 선언 방법을 비교하였습니다. Kotlin은 간단한 문법을 제공하여 클래스를 선언하고 필드, 생성자, getter, setter 등을 손쉽게 정의할 수 있습니다.

아래는 Java와 Kotlin에서의 클래스 선언 방법을 간결하게 정리한 내용입니다:

```java


package com.lannstark.lec09;  
  
public class JavaPerson {  

  
private final String name;  

private int age;  


public JavaPerson(String name, int age) {  
	this.name = name;  
	this.age = age;  
}  
  
public String getName() {  
	return name;  
}  
  
public int getAge() {  
	return age;  
}  
  
public void setAge(int age) {  
	this.age = age;  
}



   
}
```


자바에서는 이렇게 클래스를 작성하고 해당 필드에 맞는 getter와 setter를 만들어주고 생성자를 만들어주었다.

<br>


```kotlin

// 1단계
// 생성자는 파라미터 처럼 오른쪽 옆에 만든다.
class Person constructor(name:String,age:Int) {  
  
	val name:String = name  
	var age: Int = age  
}

//2단계
//이미 생성자에서 타입을 알려주기 때문에 필드쪽에서 타입 생략 가능하다
class Person constructor(name:String,age:Int) {  
  
	val name= name  
	var age = age  
  
}

//3단계
//constructor도 생략 가능하다
class Person(name:String,age:Int) {  
  
val name= name  
var age = age  
  
}

//4단계
//필드에 있는 것을 생성자쪽으로 옮겨서 생성자와 필드 한번에 선언이 가능하다.
class Person(val name:String, var age:Int) {  
  
}

```

Kotlin은 간결한 문법을 통해 필드, 생성자, getter, setter 등을 자동으로 생성해주기 때문에 코드를 더 간편하게 작성할 수 있습니다. 필요한 경우 직접 getter와 setter를 커스터마이징할 수도 있습니다.

<br>

### **Kotlin에서의 객체 인스턴스 선언 및 프로퍼티 접근**

``` kotlin

fun main() {  

	val person =Person("재롱이", 10)  
	
	println(person.name)  //getter
	println(person.age)  
	
	person.age= 15  //setter
	println(person.age)
}  
  
  
class Person (val name:String,  
			  var age:Int  
)
```
<코틀린에서 객체 인스턴스 선언 후 사용>


코틀린에서는 객체 인스턴스를 선언하고 해당 객체의 프로퍼티에 접근하는 방식이 자바와 다릅니다.

- **프로퍼티 접근 (getter):** 코틀린에서는 `. 프로퍼티명` 형식으로 직접 프로퍼티에 접근할 수 있습니다. 별도의 `get` 메서드를 호출할 필요가 없습니다.

- **프로퍼티 값 변경 (setter):** 코틀린에서는 setter 메서드가 명시적으로 존재하지 않더라도 `.프로퍼티명 = 값` 형식으로 프로퍼티의 값을 변경할 수 있습니다.

<br>


### **Kotlin 생성자 검증**

```java

public class JavaPerson {  
  
private final String name;  

private int age;  
  
public JavaPerson(String name, int age) {  

if (age <= 0) {  
	throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다", age));  
}  
	this.name = name;  
	this.age = age;  
	}
}	


//getter, setter 생략

```
<자바에서 생성자 검증 및 초기화>


```kotlin

class Person (val name:String,  var age:Int){  
//클래스가 초기화 되는 시점에 한번 호출 됨 
	init {  
		if(age<=0){  
			throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")  
		}  
	}  
}
```
<코틀린 `init` 블록 사용>

코틀린에서는 `init` 블록을 활용하여 생성자의 검증 및 초기화를 수행할 수 있습니다. `init` 블록은 클래스가 초기화될 때 생성자 호출 직후에 실행되는 블록으로, 주로 생성자 파라미터의 유효성을 검사하거나 초기화 로직을 수행하기 위해 사용됩니다.


### **Kotlin 추가 생성자**

```kotlin

fun main() {  
	val person =Person("재롱이")  
}  
  
class Person (val name:String,var age:Int){  

//추가 생성자
constructor(name: String): this(name,1)  
}
```
<클래스 내에서 `constructor` 사용하여 추가 생성자 생성>
추가 생성자는 클래스 내부에서`constructor` 을 통해서 작성합니다.

<br>

#### **생성자 요약 정리**

- 클래스는 주 생성자를 반드시 가지며, 단, 주 생성자에 파라미터가 하나도 없다면 생략 가능합니다.
  
- 부 생성자는 클래스에 있을 수도 있고 없을 수도 있습니다.
  - 부 생성자는 주 생성자를 `this`로 호출해야 합니다.
  - 부 생성자는 본문(body)을 가질 수 있습니다.

```kotlin
class Person (
    val name: String = "김종훈",
    var age: Int = 1
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }
}```

하지만 보통은 위 와 같이 `default parameter`를 활용하는 것이 권장되며, `constructor`를 사용하여 추가 생성자를 만드는 대신 정적 팩토리 메소드를 사용하는 것이 좋습니다.


### **함수로 프로퍼티 선언**

사용자가 직접 커스텀 해서 메소드를 정의 할 수도 있다.

```kotlin

class Person(val name: String = "김종훈", var age: Int = 1) {

    // isAdult() 함수를 사용하여 성인 여부를 확인
    fun isAdult(): Boolean {
        return age >= 20
    }
}

```

`isAdult()` 함수를 사용하여 성인 여부를 확인합니다.

<br>

### **커스텀 Getter와 Setter로 프로퍼티 선언:**

```kotlin


class Person(
    name: String = "김종훈",
    var age: Int = 1
) {

    // name 프로퍼티를 get 할 때 무조건 대문자로 변경
	    val name = name
        get() = field.uppercase()

	// name 프로퍼티를 set할때 무조건 대문자로 변경 	
        set(value) {  
		field =value.uppercase()  
		}

    // 커스텀 getter를 사용하여 성인 여부를 확인
    val isAdult: Boolean
        get() = this.age >= 20


}


```
- `name` 프로퍼티는 커스텀 getter, setter 를 사용하여 값을 읽을 때 무조건 대문자로 변환합니다.
- `isAdult` 프로퍼티는 커스텀 getter를 사용하여 성인 여부를 확인합니다.

<br>

####  **백킹 필드(`field`)**

백킹 필드 (`field`)는 프로퍼티의 실제 값을 저장하는 변수입니다. 이 변수는 외부에서 프로퍼티에 접근할 때 사용되며, 프로퍼티의 값을 저장하고 반환하거나 변경하는 데 중요한 역할을 합니다.

<br>

**왜 필드(`field`)를 사용해야 하는지:**

백킹 필드(`field`)는 프로퍼티의 값을 저장하는 데 사용되는 실제 변수입니다. 즉, 클래스 내부에 숨겨져 있는 변수로서, 외부에서 프로퍼티에 접근할 때 사용됩니다. 이것은 프로퍼티의 값을 저장하고, 값을 반환하거나 변경하는 데 중요한 역할을 합니다.  또한 무한 루프를 방지 할 수 있다.

<br>

예를 들어, 다음과 같은 프로퍼티를 고려해 봅시다.

```kotlin

var age: Int
    get() = _age //보통 언더스코어(`_`)를 이용하여 백킹 필드를 만든다.
    set(value) {
        if (value <= 0) {
            throw IllegalArgumentException("나이는 $value일 수 없습니다.")
        }
        _age = value
    }
```

위의 코드에서 `_age`가 백킹 필드입니다. `age` 프로퍼티의 값을 실제로 저장하고 있는 변수로, Getter와 Setter 내에서 `_age`를 사용하여 값을 읽거나 저장합니다.

백킹 필드는 프로퍼티와 프로퍼티를 제어하는 커스텀 Getter와 Setter 간의 중간 매개체로 작용하며, 프로퍼티의 값 변경과 관련된 로직을 수행할 때 유용하게 활용됩니다. 이를 통해 코드를 더욱 안전하고 유지보수 가능하게 만들 수 있습니다.

<br>

####  **다양한 방식의 커스텀 getter 예제**

```kotlin

class Person(  
val name: String = "김종훈",  
var age: Int = 1  
) {  
  
//함수 형식으로 getter
fun getUpperCaseName(): String = this.name.uppercase()  
  
//프로퍼티 형식으로 getter  
val upperCaseName : String  
get() = this.name.uppercase();  
  
  
init {  
	if (age <= 0) {  
throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")  
	}  
}  
  
  
val isAdult: Boolean  
get() = this.age >= 20;  
  
}
```

위 코드에서는 다양한 방식으로 Getter를 정의하고 있습니다:

1. `getUpperCaseName()` 함수를 사용하여 `name` 프로퍼티를 대문자로 변환하여 반환하고 있습니다.
2. `upperCaseName` 프로퍼티는 커스텀 getter를 사용하여 `name`을 대문자로 변환한 값을 반환합니다.

이처럼  백킹필드를 사용하지 않아도 getter를 정의 할 수 있습니다.  그리고 그게 가독성이 보통 더 좋으니 default parameter 나 정적팩토리 메소드를 활용하는게 좋습니다.



## **Kotlin에서의 상속**


### Kotlin에서의 추상클래스 작성 및 상속 선언:

Kotlin에서 추상 클래스를 작성하고 상속을 선언하는 방법을 살펴보겠습니다.

```java


//자바에서의 추상클래스 작성 
public abstract class JavaAnimal {  
  
	protected final String species;  
	protected final int legCount;  
  
public JavaAnimal(String species, int legCount) {  
	this.species = species;  
	this.legCount = legCount;  
}  
  
abstract public void move();  
  
public String getSpecies() {  
	return species;  
}  
  
public int getLegCount() {  
	return legCount;  
}  
  
}

//자바에서의 상속

public class JavaCat extends JavaAnimal {  
  
public JavaCat(String species) {  
	super(species, 4);  
}  
  
@Override  
public void move() {  
	System.out.println("고양이가 사뿐 사뿐 걸어가~");  
}  
  
}

```

<br>

```kotlin


// 부모 클래스 정의
abstract class Animal(
    protected val species: String,
    protected val legCount: Int
) {
    // 추상 메서드로 선언하여 하위 클래스에서 반드시 구현해야 함
    abstract fun move()
}

// 자식 클래스 정의, 상속은 콜론(:)을 사용하여 선언
class Cat(
    species: String
) : Animal(species, 4) {
    // move() 메서드를 오버라이드하여 동작 구현
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}





```

1. `abstract class Animal`: 부모 클래스 `Animal`을 정의합니다. 이 클래스는 추상 클래스로 선언되어 있어서 인스턴스를 직접 생성할 수 없으며, 하위 클래스에서 반드시 구현해야 하는 추상 메서드인 `move()`를 선언하고 있습니다.
    
2. `class Cat`: 자식 클래스 `Cat`을 정의합니다. `:`(콜론)을 사용하여 부모 클래스를 상속하며, `Animal(species, 4)`를 통해 부모 클래스의 생성자를 호출합니다. 이 때, `Cat` 클래스에서는 `move()` 메서드를 오버라이드하여 부모 클래스의 추상 메서드를 구체적으로 구현합니다.
    

<br>

#### Kotlin에서의 상속 선언 추가 설명

```kotlin

class Penguin(species: String) : Animal(species, 2) {

    override fun move() {
        println("펭귄이다아")
    }

	//getter를 오버라이딩하여 재정의
    override val legCount: Int
        get() = super.legCount * 2
}

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}


	
```

1. `Penguin` 클래스에서는 부모 클래스인 `Animal`의 필드 `legCount`를 오버라이딩하고 있습니다. 이때, 부모 클래스의 `legCount` 필드를 `open`으로 선언해야만 하위 클래스에서 오버라이딩할 수 있습니다.
    
2. `Penguin` 클래스에서 `legCount`의 값을 오버라이딩하여 `super.legCount`를 2배로 곱한 값을 반환하고 있습니다. 이렇게 하면 펭귄의 다리 개수를 계산하고 있습니다.
    

Kotlin에서는 상속한 클래스의 필드를 오버라이딩할 때, 해당 필드가 `open`으로 선언되어야 하며, 필요한 경우 오버라이딩한 값을 재정의할 수 있습니다. 이를 통해 상속을 유연하게 활용할 수 있습니다.

참고로 상위클래스에 대한 키워드는 `Super`로 자바와 같다. 또한 추상 클래스는 당연히 인스턴스화 할 수 없다.

<br>


###  **Kotln에서의 인터페이스 작성** 

```kotlin

//자바에서의 인터페이스
public interface JavaFlyable {  
  
default void act(){  
	System.out.println("파닥 파닥");  
	}  
  
}

//코틀린에서의 인터페이스
interface Flyable {  
  
fun act(){  
println("파닥 파닥")  
}  
  
//구현부를 포함 안하면 추상 메소드  
fun fly()  
}
```

Kotlin에서 인터페이스는 클래스가 구현해야 하는 메서드의 집합을 정의하는 추상화된 개념입니다. 위의 코드에서 `Flyable` 인터페이스는 다음과 같은 특징을 가집니다:

1. `act()` 메서드: 이 메서드는 기본 구현을 가지고 있습니다. 인터페이스 내부에 구현이 포함된 메서드는 기본 구현이며, 하위 클래스에서 재정의하지 않아도 됩니다. 하지만 필요에 따라 하위 클래스에서 재정의할 수 있습니다.
    
2. `fly()` 메서드: 이 메서드는 추상 메서드로 선언되어 있습니다. 인터페이스 내에 추상 메서드가 선언되면 하위 클래스에서 반드시 구현해야 합니다. 따라서 `fly()` 메서드는 모든 `Flyable` 인터페이스를 구현한 클래스에서 구체적인 동작을 정의해야 합니다.

<br>

#### **Kotln에서의 인터페이스 선언 방법**

```kotlin

class Penguin(species: String) : Animal(species, 2), Swimable, Flyable {
    override fun move() {
        println("펭귄이다아")
    }

    override val legCount: Int
        get() = super.legCount * 2

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override fun fly() {
        println("날다~~")
    }
}

```

뒤에 일반적으로 상속 뒤에 `,`를 붙이면 됩니다.

```kotlin

//상속받을 부모 클래스가 없는 경우
class Penguin : Swimable, Flyable {
    override fun move() {
        println("펭귄이다아")
    }

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override fun fly() {
        println("날다~~")
    }
}

```

Kotlin에서 클래스가 상속받을 부모 클래스가 없는 경우에도 인터페이스를 구현하는 방법은 간단합니다. 클래스 선언 시 `:`(콜론)을 사용하여 구현할 인터페이스를 나열하면 됩니다. 위의 코드에서 `Penguin` 클래스는 부모 클래스를 상속하지 않고, `Swimable`과 `Flyable` 인터페이스를 구현하고 있습니다.

이렇게 하면 클래스는 부모 클래스를 상속받지 않고도 하나 이상의 인터페이스를 구현할 수 있습니다. 클래스가 구현한 인터페이스의 메서드와 프로퍼티를 오버라이딩하여 원하는 동작을 구현할 수 있습니다.

만약에 중복 되는 인터페이스를 특정 할 때는 `super<타입>.함수` 를 사용합니다.

<br>

#### **Kotlin 인터페이스만의 기능**

Kotlin에서는 인터페이스 내에서 backing field가 없는 프로퍼티를 정의할 수 있습니다. 이러한 프로퍼티는 인터페이스를 구현하는 클래스에서 getter를 통해 값을 제공할수도 있고 값을 직접 설정할 수도 있습니다. 아래의 예제 코드를 통해 설명하겠습니다.

```kotlin

interface Swimable {

    // 수영 능력치 프로퍼티
    val swimAbility: Int
	    // get()=3 -> 직접 바로 값을 넣을 수도 있다.
    
    // 기본 구현을 가진 메서드
    fun act() {
        println("어푸 어푸")
    }
}

class Penguin(species: String) : Animal(species, 2), Swimable, Flyable {
    override fun move() {
        println("펭귄이다아")
    }

    override val legCount: Int
        get() = super.legCount * 2

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override fun fly() {
        println("날다~~")
    }

    // 추가 된 내용
    override val swimAbility: Int = 3 // 구현 클래스에서 swimAbility 값을 직접 설정
	//get() = super.swimAbility -> 만약에 인터페이스에서 직접 값을 설정했다면 그대로 설정 
}


```

위의 코드에서 `Swimable` 인터페이스 내에서 `swimAbility`라는 프로퍼티가 선언되어 있습니다. 이 프로퍼티는 `backing field`가 없으며, 구현 클래스에서 getter를 통해 값을 제공해야 합니다. `Penguin` 클래스에서는 `swimAbility`를 구현하여 해당 값을 제공하고 있습니다.

이러한 방식으로 Kotlin에서는 인터페이스 내에서 프로퍼티를 선언하고, 구현 클래스에서 이를 구현할 때 값을 제공할 수 있습니다.


#### **Kotlin 상속 관련 키워드 정리**

1. `final` : `override` 할 수 없게 한다. dafault로 보이지 않게 존재한다.
2. `open`: `override`를 열어 준다.
3. `abstract`: 반드시 `override` 해야한다.
4. `override`: 상위 타입을 `override` 하고 있다.


#####  **Kotlin 에서 상속을 다루는 방법**

- 상속 또는 구현을 할 때에 : 을 사용해야 한다.
- 상위 클래스 상속을 구현 할 때 생성자를 반드시 호출해야 한다.
- override를 필수로 붙여야 한다.
- 추상 멤버가 아니면 기본적으로 오버라이드가 불가능하다.
	-  open을 사용해주어야 한다.
- 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 얘기치 못한 버그가 생길 수 있다.


###### **Kotlin에서 클래스 상속 할 때 주의 할점**

상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 얘기치 못한 버그가 생길 수 있다. 에 대한 보충 설명을 아래의 예제를 통해 설명하겠습니다.


```kotlin

open class Animal {
    open val sound = "무음"
    
    init {
        makeSound()
    }
    
    open fun makeSound() {
        println("Animal makes a sound: $sound")
    }
}

class Cat : Animal() {
    override val sound = "야옹"
    
    override fun makeSound() {
        println("Cat makes a sound: $sound")
    }
}

```


이 코드에서 `Animal` 클래스는 초기화 블록에서 `makeSound` 메서드를 호출하고 있으며, 이 메서드는 `sound` 프로퍼티를 출력합니다. `Cat` 클래스는 `Animal` 클래스를 상속받고, `sound` 프로퍼티와 `makeSound` 메서드를 오버라이드하고 있습니다.

이제 `Cat` 클래스의 인스턴스를 생성하고 `makeSound` 메서드를 호출해보겠습니다.

<br>

```kotlin

fun main() {
    val cat = Cat()
    cat.makeSound()
}


```

예상한 결과는 "Cat makes a sound: 야옹"이 출력되는 것입니다. 하지만 실제로 실행하면 다음과 같은 결과가 나옵니다.

```yaml
Animal makes a sound: null
Cat makes a sound: 야옹
```


이 문제의 원인은 `Animal` 클래스의 초기화 블록에서 `makeSound` 메서드를 호출할 때, 하위 클래스인 `Cat` 클래스의 오버라이드된 메서드가 아닌 상위 클래스의 메서드가 호출되었습니다. 그리고 `sound` 프로퍼티는 초기화되지 않아 기본값인 `null`이 출력되었습니다.

이러한 문제는 `Animal` 클래스에서 `open` 프로퍼티 `sound`를 사용하면 발생하는데, 하위 클래스에서 이를 오버라이드하더라도 초기화 시점에서는 하위 클래스의 프로퍼티가 아니라 상위 클래스의 프로퍼티가 사용되는 것입니다.

이러한 이슈를 피하기 위해서는 생성자 매개변수를 통해 값을 초기화하거나, 초기화 블록에서 상위 클래스의 메서드를 호출하지 않도록 주의해야 합니다. 이런 종류의 상속 문제를 방지하기 위해 상위 클래스에서 `open` 프로퍼티를 사용하는 대신 생성자 매개변수나 초기화 블록에서 값을 초기화하고, 초기화 블록에서 오버라이드된 메서드를 호출하지 않는 것이 좋은 설계 방법일 수 있습니다.


## **Kotlin에서 접근 제어**


<br>

### **Java와 Kotlin의 가시성 제어 비교**

해당 테이블을 통해서 Java와 Kotlin에서의 접근 제어자가 어떻게 다른지 설명 드리겠습니다.


**Java에서의 가시성 제어:**

|가시성|접근 가능한 범위|
|---|---|
|public|모든 곳에서 접근 가능|
|protected|같은 패키지 또는 하위 클래스에서만 접근 가능|
|default|같은 패키지에서만 접근 가능|
|private|선언된 클래스 내에서만 접근 가능|

Java의 기본 접근 지시어는 default이다.

<br>

**Kotlin에서의 가시성 제어:**

|가시성|접근 가능한 범위|
|---|---|
|public|모든 곳에서 접근 가능|
|protected|선언된 클래스 또는 하위 클래스에서만 접근 가능|
|internal|같은 모듈에서만 접근 가능|
|private|선언된 클래스 내에서만 접근 가능|

Kotlin의 기본 접근 지시어는 public이다.

<br>

Kotlin에서는 패키지를 네임스페이스를 관리하기 위한 용도로 사용하고, 가시성 제어에는 주로 클래스 레벨에서 사용됩니다. 모듈 시스템을 통해 `internal` 가시성은 같은 모듈 내에서 접근을 허용하며, 이를 활용하여 모듈 간의 관계를 더욱 명확하게 관리할 수 있습니다.

즉, Kotlin에서는 패키지라는 개념을 접근 제어에 사용하지 않기 때문에 `protected` 에서 해당 패키지 접근이 빠지고 `default` 는 사라지는 대신에 모듈을 접근 제어하는 기능이 생겼다라고 생각하시면 됩니다.

<br>


#### **Kotlin 파일에서의 접근 제어**

기본적으로 Kotlin은 .kt 파일에 변수 , 함수 ,클래스 여러 개를 바로 만들 수 있습니다.


**Kotlin 파일에서의 접근 제어:**

|가시성|접근 가능한 범위|
|---|---|
|public|기본값 어디서든 접근 할 수 있다.|
|protected|파일 최상단에는 사용 불가능하다.|
|internal|같은 모듈에서만 접근 가능|
|private|같은 파일내에서만 사용 가능하다.|

<br>


#### **Java와 Kotlin을 함께 사용 할 때 주의 할점**

- internal은 바이트 코드 상 public이 된다. 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져 올 수 있다.
- Kotlin의 protected와 Java의 protected는 다르다. Java는 같은 패키지의 Kotlin protedcted 멤버에 접근 할 수 있다.



##  **Kotlin에서 object 키워드**

<br>


### **Java에서의 static 함수와 변수**

```java

package com.lannstark.lec12;  
  
public class JavaPerson {  
  
	private static final int MIN_AGE = 1;  
	private String name;  
	private int age;  
  
private JavaPerson(String name, int age) {  
	this.name = name;  
	this.age = age;  
	}  
  
public static JavaPerson newBaby(String name) {  
	return new JavaPerson(name, MIN_AGE);  
	}  
  
}
```


Java에서는 위와 같이 클래스 수준의 정적(static) 함수와 변수를 선언할 수 있습니다. 이러한 정적 멤버는 클래스 자체에 속하며, 클래스의 인스턴스를 생성하지 않고도 클래스 이름을 통해 접근할 수 있습니다. 위 예제에서는 `JavaPerson` 클래스에서 정적 변수 `MIN_AGE`와 정적 함수 `newBaby()`를 선언하고 있습니다. 이러한 정적 멤버는 클래스의 공용(static) 멤버로서 사용됩니다.

<br>

### **Kotlin에서의 static 함수와 변수**

```kotlin

class Person private constructor(var name: String , var age:Int){  
  
	companion object NewObject{  //NewObject는 객체 이름이다 붙여도 되고 안붙여도 상관없다.
		private const val MIN_AGE =1  
		fun newBaby(name: String):Person{  
			return Person(name, MIN_AGE)  
		}  
	}  
}
```

Kotlin에서는 `companion object`을 사용하여 클래스 수준의 정적(static) 함수와 변수를 선언합니다. 이렇게 선언된 `companion object`는 해당 클래스의 인스턴스를 생성하지 않고도 클래스 이름을 통해 접근할 수 있는 정적 멤버를 정의합니다.

- Java에서는 정적(static) 멤버를 선언할 때 `static` 키워드를 사용하며, Kotlin에서는 `companion object`를 사용합니다.
- Kotlin에서 `const` 키워드를 사용하지 않은 경우, 해당 변수는 런타임 중에 변경될 수 있는 일반적인 정적(static) 변수입니다. 이 경우, 변수의 값은 컴파일 시점이 아니라 런타임 중에 결정됩니다.

즉, `const` 키워드를 사용한 변수는 컴파일 시점에 이미 값을 가지고 있으며 변경할 수 없는 불변의 상수이고, `const` 키워드를 사용하지 않은 변수는 런타임 중에 값이 결정되며 변경 가능한 정적(static) 변수입니다.

<br>

<**요약**>

`static` : 클래스가 인스턴스화 될때 새로운 값을 복제하는 것이 아니라 정적으로 인스턴스끼리의 값을 공유 

`companion object`: 클래스와 동행하는 유일한 오브젝트이며 `companion object`도 하나의 객체로 간주된다. 때문에 이름을 붙일 수도 있고 , 인터페이스를 구현 할 수도 있다.

<br>

#### Java에서 Kotlin static field 나 static 함수를 사용 하고 싶을 때


Java와 Kotlin을 같이 사용 할 때 Java에서 Kotlin에 있는 Static을 사용 할 수 있습니다. 
2가지 경우가 있을 수 있는데 밑의 코드로 각 경우를 설명하겠습니다.
```kotlin

//코틀린
class Person private constructor(var name: String , var age:Int){  
  
	companion object {   
		private const val MIN_AGE =1  
		fun newBaby(name: String):Person{  
			return Person(name, MIN_AGE)  
		}  
	}  
}

//자바
//@JvmStatic 붙이면 Person.newBaby("짱구"); 로 줄이는게 가능하다.
public static void main(String[] args) {  

	Person.Companion.newBaby("짱구");  
}  
  
}


```

이렇게 이름이 없는 경우에는 `객체`.`Companion`을 통해서 해당 함수를 가져오면 된다.
만약에 `Companion`을 생략하고 싶다면 `@JvmStatic` 어노테이션을 붙이면  생략 할 수 있다.

<br>


```kotlin

//코틀린
class Person private constructor(var name: String , var age:Int){  
  
	companion object kjh{   
		private const val MIN_AGE =1  
		fun newBaby(name: String):Person{  
			return Person(name, MIN_AGE)  
		}  
	}  
}

//자바
public static void main(String[] args) {  

	Person.kjh.newBaby("김종훈");
}  
  
}

```

객체 이름이 있는 경우에는 `객체`.`static객체 이름` 통해서 해당 함수를 가져오면 된다.


#### **싱글톤**

코틀린에서는 클래스 이름앞에 object 키워드를 붙이면 곧바로 싱글톤 클래스가 됩니다.  
하지만 이경우에는 생성자를 호출하지 않는 클래스에서만 사용할 수 있습니다.

```kotlin
// 싱글톤 클래스를 만들려면 앞에 object 를 붙이면 된다.
object MyObjectSingleton {
    fun printMsg(msg: String) {
        Log.d("MyObjectSingleton", "msg: $msg")
    }
}
```


<br>

####  익명클래스

Kotlin에서는 익명 클래스를 생성할 때 Java와는 약간 다른 방식을 사용합니다.

```java

interface BankInterface { 
    fun account()
}

abstract class BankClass {
    abstract fun account()
}

fun main() {
    val bankInterface = object : BankInterface {
        override fun account() {
            println("Interface Account")
        }
    }

    val bankClass = object : BankClass() {
        override fun account() {
            println("abstract Class Account")
        }
    }

    println(bankInterface.account())
    println(bankClass.account())
}```

Kotlin에서 익명 클래스를 만들 때에는 `object` 키워드를 사용합니다. `object` 키워드를 통해 익명 클래스를 정의하고, 필요한 인터페이스나 추상 클래스를 구현하거나 상속합니다. 위의 예제에서는 `BankInterface` 인터페이스와 `BankClass` 추상 클래스에 대한 익명 클래스를 생성하고 각각의 메서드를 구현하고 있습니다.

이렇게 Kotlin에서 익명 클래스를 사용하면 Java와 유사한 방식으로 인터페이스와 추상 클래스를 활용할 수 있으며, 가독성을 유지하면서 코드를 작성할 수 있습니다.


<br>

### **Kotlin에서 변수 선언**


Kotlin에서 변수를 선언할 때는 `var`와 `val` 키워드를 사용합니다. 이 두 키워드는 변수의 수정 가능 여부를 나타냅니다. 여기에 Kotlin에서의 변수 선언 방식을 설명하겠습니다:

```kotlin
val person = Person("짱구", 10)

val log = "사람의 이름은 ${person.name} 이고 나이는 ${person.age} 세 입니다."

prinln(log)
```


- `var`: 가변 변수를 선언합니다. 이 변수의 값은 언제든지 수정할 수 있습니다.
- `val`: 불변 변수를 선언합니다. 이 변수의 값은 한 번 초기화되면 수정할 수 없습니다. 재할당이 불가능합니다.

코틀린에서는 변수를 사용하기 전에 반드시 초기값을 할당해주어야 합니다. 또한, `val`을 사용하여 변수를 선언하면 해당 변수는 한 번만 초기화할 수 있습니다.

Kotlin에서의 변수 선언은 Java와 달리 명시적으로 수정 가능 여부를 표시하므로 코드의 가독성을 높이고 버그를 줄일 수 있습니다.

<br>

## Kotlin에서 중첩 클래스를 다루는 방법


자바에서는 `static` 을 사용하는 중첩 클래스 `static` 을 사용하지 않는 중첩 클래스 2가지가 존재한다. 둘의 차이는 바깥을 참조 하냐 안하냐의 유무인데 Kotlin에서는 `static`을 사용하지 않으므로 조금 다릅니다.

### 바깥 클래스에 대한 참조가 없는 중첩 클래스

Kotlin에서 중첩 클래스를 만들 때, 기본적으로 바깥 클래스에 대한 참조가 없는 중첩 클래스가 만들어집니다. 이 경우, 중첩 클래스는 일반적인 클래스처럼 독립적으로 사용됩니다. 예를 들어, 다음과 같은 코드를 보겠습니다:

```kotlin

class JavaHouse(
    val address: String,
    val livingRoom: LivingRoom
) {

    class LivingRoom(private val area: Double) {
        
    }
}

```

위 코드에서 `LivingRoom` 클래스는 `JavaHouse` 클래스 내에 중첩 클래스로 정의되어 있지만, 바깥 클래스인 `JavaHouse`에 대한 참조를 가지고 있지 않습니다. 따라서 `LivingRoom`은 독립적으로 존재하며, `JavaHouse`의 인스턴스 없이도 사용할 수 있습니다.  

<br>


### 바깥 클래스에 대한 참조가 있는 중첩 클래스

바깥 클래스에 대한 참조가 있는 중첩 클래스는 `inner` 키워드를 사용하여 정의됩니다. 이 경우, 중첩 클래스는 바깥 클래스의 인스턴스를 가리키는 참조를 갖습니다. 예를 들어

```kotlin

class JavaHouse(
    val address: String,
    val livingRoom: LivingRoom
) {

    inner class LivingRoom(private val area: Double) {
        val address: String
            get() = this@JavaHouse.address
    }
}

```

위 코드에서 `LivingRoom` 클래스는 `inner` 키워드로 정의되었으므로 바깥 클래스인 `JavaHouse`에 대한 참조를 가집니다. 따라서 `LivingRoom` 내에서 `this@JavaHouse`를 사용하여 바깥 클래스의 멤버에 접근할 수 있습니다.

이렇게 Kotlin에서 중첩 클래스를 다룰 때, 바깥 클래스에 대한 참조의 유무에 따라 중첩 클래스의 동작이 달라집니다. 필요에 따라 적절한 방식을 선택하여 중첩 클래스를 활용할 수 있습니다.


<br>


## Kotlin에서 다양한 클래스를 다루는 방법



### Data 클래스

일반 클래스와 달리, **다양한 메소드를 자동으로 생성**해주는 클래스입니다. 편리함을 제공하는 유용한 메소드**들이 자동 생성된다.  DTO처럼 사용하는 클래스라고 생각하시면 됩니다.(데이터 이동 목적)

**Data Class 생성 시 같이 만들어지는 메소드**

- `hashCode()`
- `copy()`
- `equals()`
- `toString()`
- `componentsN()`

또한 아래와 같은 여러 가지 다양한 특징을 갖고 있다.

- 기본 생성자에 **1개 이상의 파라미터**가 있어야 함
- 기본 생성자의 파라미터가 `val` 또는 `var` 로 선언해야 함
- **다른 클래스를 상속받을 수 없음** (슈퍼 클래스를 가질 수 없음)  
    단, `sealed` 클래스는 상속받을 수 있으며, 인터페이스는 구현할 수 있음 (v1.1 이후 기준)
- `abstract`, `open`, `sealed`, `inner` 등 키워드를 붙일 수 없음
- 자동으로 생성한 메소드를 오버라이딩할 경우, 오버라이드 된 메소드 사용

이론은 여기까지 해두고, 이제부턴 **Data Class** 의 특장점에 대해서 코드로 설명하겠습니다.

```kotlin

public class JavaPersonDto {  
  
    private final String name;  
    private final int age;  
  
    public JavaPersonDto(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    @Override  
    public boolean equals(Object o) {  
        if (this == o) return true;  
        if (o == null || getClass() != o.getClass()) return false;  
        JavaPersonDto that = (JavaPersonDto) o;  
        return age == that.age && Objects.equals(name, that.name);  
    }  
  
    @Override  
    public int hashCode() {  
        return Objects.hash(name, age);  
    }  
  
    @Override  
    public String toString() {  
        return "JavaPersonDto{" +  
                "name='" + name + '\'' +  
                ", age=" + age +  
                '}';  
    }  
}

```

요새는 IDE도 좋고 , lombok을 활용해서 다 간편하게 만들어주지만 근본적으로 자바에서는 클래스가 장황해지거나 클래스 생성 이후 추가적인 처리를 해줘야 한다는 단점이 있었습니다.

그럼 Kotlin에서는 어떻게 작성하는지 밑의 코드를 통해 확인해보겠습니다.

```kotlin

data class JavaPersonDto(  
    val name: String,  
    val age: Int  
) {  
}

```

앞에 `data` 키워드 붙이면 위의 자바 코드의 동일한 기능 전부 사용 가능합니다.  

### Enum 클래스

Enum(열거형) 클래스는 일반적으로 고정된 상수 목록을 정의하는데 사용됩니다. Kotlin에서 Enum 클래스를 작성하는 방법은 다음과 같습니다.


```kotlin

public enum JavaCountry {  
  
	KOREA("KO"),  
	AMERICA("US"),  
;  
  
	private final String code;  
  
	JavaCountry(String code) {  
		this.code = code;  
	}  
  
	public String getCode() {  
		return code;  
	}  
  
}
```

이건 기존 Java에서 작성하던 방식입니다.



```kotlin


enum class Country(private val code:String) {  
  
	KOREA("KO"),  
	AMERICA("US")  
}
```

위 코드에서 `enum class`를 사용하여 Enum 클래스를 정의했습니다. 이 클래스는 `Country`라는 이름을 가지며, 두 개의 열거 상수(`KOREA`와 `AMERICA`)를 포함하고 있습니다. 각 열거 상수는 괄호 안에 있는 `private val code: String`와 함께 선언됩니다.  



#### Enum Class와 when의 응용하는 방법

Kotlin에서 Enum 클래스와 `when` 식을 사용하면 코드를 간결하게 작성할 수 있습니다. 아래는 Java에서 Enum을 사용한 코드와 Kotlin에서 Enum과 `when` 식을 사용한 코드의 비교입니다.


**Java 코드:**

```kotlin

private static void handleCountry(JavaCountry country) {  
	if (country == JavaCountry.KOREA) {  
	// 로직 처리  
	}  
  
	if (country == JavaCountry.AMERICA) {  
	// 로직 처리  
	}  
}
```

<br>

**Kotlin 코드:**

```kotlin

fun handleCountry(country: Country) {  
	when (country) {  
		Country.AMERICA -> println("아메리카")  
		Country.KOREA -> println("한국")  
	}  
}
```

위의 Kotlin 코드에서 `when` 식을 사용하면 `Country` Enum의 각 열거 상수에 대한 처리가 간결하게 구현됩니다. Enum 상수에 따라 다른 로직을 수행하고 있으며, 코드의 가독성이 향상되고 조건문을 간결하게 작성할 수 있습니다.


<br>




### Sealed 클래스

`sealed` 클래스는 **자기 자신이 추상 클래스**이고, **자신을 상속받는 여러 서브 클래스**들을 가질 수 있다. 이를 사용하면 **`enum` 클래스와 달리 상속을 지원**하기 때문에, **상속을 활용한 풍부한 동작**을 구현할 수 있다.

<br>

`sealed` 클래스 밑에 같은 특징들을 가진다. 
- 자기 자신이 추상 클래스이고, 자신을 상속받는 여러 서브 클래스들을 가질 수 있다. ⇒ enum클래스와 달리 상속을 지원하기 때문에, 다양한 동작 구현 가능
- 상속받는 서브 클래스의 종류를 제한할 수 있음.
- **상태가 바뀌지 않는 경우 `object`를 사용하는 것을 권장**


<br>

Sealed 클래스는 다음과 같이 선언됩니다:

```kotlin
sealed class Result {
    class Success(val value: Int) : Result()
    class Error(val message: String) : Result()
}
```

위의 예제에서 `Result`는 Sealed 클래스이고, 하위 클래스로 `Success`와 `Error`가 있습니다.

<br>

#### Sealed 인터페이스

Sealed 인터페이스는 Sealed 클래스와 유사하지만, 인터페이스 형태로 사용됩니다. Sealed 인터페이스의 하위 클래스도 동일한 파일 내에 있어야 하며, 이를 통해 하위 클래스의 확장이 제한됩니다.

Sealed 인터페이스는 다음과 같이 선언됩니다:
```kotlin
sealed interface Shape {
    class Circle(val radius: Double) : Shape
    class Rectangle(val width: Double, val height: Double) : Shape
}
```


위의 예제에서 `Shape`는 Sealed 인터페이스이고, 하위 클래스로 `Circle`과 `Rectangle`이 있습니다.

<br>

##### Sealed 클래스 및 Sealed 인터페이스 사용 예제

Sealed 클래스와 Sealed 인터페이스는 주로 패턴 매칭을 통해 사용됩니다. 예를 들어, 다음은 Sealed 클래스를 패턴 매칭하여 처리하는 예제입니다:

```kotlin
fun evaluate(result: Result): String {
    return when (result) {
        is Result.Success -> "Success: ${result.value}"
        is Result.Error -> "Error: ${result.message}"
    }
}
```

위의 함수 `evaluate`는 `Result` Sealed 클래스를 인자로 받아, 패턴 매칭을 통해 각 하위 클래스에 따라 다른 동작을 수행합니다.


#### Enum class vs Sealed clas

👉🏻둘다 타입을 제한적으로 사용하고자 할 때 많이 사용하게 된다.

- `Enum`에서는 특정 값을 single instance로서 하나의 객체만 제한적으로 사용할 수 있으며, 생성자의 형태도 동일해야만 한다.
- `Sealed`에서는 state을 포함하고 있는 여러개의 instance를 가질 수 있고, 생성자도 각각의 특징에 따라서 다르게 가져갈 수 있다. ⇒ 정적인 아닌 다양한 state를 사용할 수 있다.



## Kotlin에서 배열과 컬렉션을 다루는 방법

<br>


### 배열

배열은 프로그래밍에서 데이터를 여러 개 저장하는 자료 구조 중 하나이며, Kotlin에서도 지원합니다. 그러나 Kotlin에서는 배열 대신 더 풍부한 기능을 가진 리스트(List)를 주로 사용하는 것이 권장됩니다. Effective Java와 같은 책에서도 "배열보다는 리스트를 사용하라"는 권고사항을 내놓는 이유 중 하나입니다.


**먼저 자바에서의 배열 코드:**

```kotlin

public static void main(String[] args) {  
  
	int[] array = {100, 200};  
  
	for (int i = 0; i < array.length; i++) {  
		System.out.printf("%s,%s,", i, array[i]);  
	}  
}

```


**위의 자바 코드를 Kotlin으로 바꾼 코드:**

```kotlin

fun main() {  
  
	val array = arrayOf(100,200)  
	//array.withIndex() //-> 인덱스와 밸류를 한번에 받음  
	for (i in array.indices){ //0부터 마지막 인덱스를 끝까지  
		println("${i} ${array[i]}")  
	}  
//	for ((idx,value) in array.withIndex()){  
//		println("$idx,$value")  
//	} 
	
	array.plus(333)
}
```

위 코드에서는 `arrayOf` 함수를 사용하여 배열을 생성하고, `array.indices`를 통해 배열의 인덱스 범위를 얻어와 반복문을 통해 각 원소에 접근합니다.
다른 방법으로는 `array.withIndex()` 도 있습니다. `array.withIndex()` 는 `IndexedValue` 객체의 시퀀스를 생성하여 각 요소와 해당 인덱스를 쌍으로 제공합니다. 
`array.plus()` 메소드는 배열에 새로운 요소를 추가하지 않고, 새로운 배열을 생성하여 기존 배열과 지정된 요소를 포함합니다. 이 메소드는 기존 배열을 변경하지 않으며, 새로운 배열을 반환할 수 있습니다.

<br>

### Collection

`Collection`은 Kotlin에서 기본적으로 불변(immutable) 형태로 생성됩니다. 이 `Collection`을 구성하는 주요 인터페이스에는 다음과 같은 세 가지가 있습니다:

1. `List`: 순서가 있는 요소들의 컬렉션입니다. 요소의 순서가 중요하며, 동일한 요소를 중복해서 포함할 수 있습니다.
    
2. `Set`: 순서가 없는 고유한 요소들의 컬렉션입니다. 요소는 중복해서 포함할 수 없으며 순서가 없으므로 인덱스로 요소를 접근할 수 없습니다.
    
3. `Map`: 키-값 쌍의 컬렉션입니다. 각 키는 고유해야 하며, 키를 사용하여 해당 키와 연결된 값을 가져올 수 있습니다.
    

또한, Kotlin에서는 가변(mutable) 버전의 컬렉션도 제공됩니다. 이들 가변 컬렉션은 데이터를 추가, 수정 및 삭제할 수 있는 기능을 가지고 있습니다. 가변 컬렉션은 불변 컬렉션과 다른 인터페이스를 가지고 있으며 다음과 같이 나타납니다:

1. `MutableList`: 가변 리스트. 요소의 추가, 삭제, 수정이 가능합니다.
    
2. `MutableSet`: 가변 세트. 요소의 추가, 삭제가 가능하며 중복 요소를 허용하지 않습니다.
    
3. `MutableMap`: 가변 맵. 키-값 쌍을 추가, 삭제 및 수정할 수 있습니다.


따라서 `Collection` 을 만들 때는 Kotlin에서 변수에게 `var`와 `val`을 꼭 선언해줘야 하는 것처럼 불변인지 가변인지 설정해야한다.


*주의 사항*
 물론, 불변 컬렉션은 해당 컬렉션의 구조(크기, 요소 추가, 삭제 등)를 변경하지 못하게 합니다. 즉, 요소의 추가, 삭제 또는 수정이 불가능합니다. 그러나 불변 컬렉션 내에서 참조 타입(객체)을 가진 요소의 경우, 해당 요소에 대한 참조는 변경 가능합니다. 다시 말해, 불변 컬렉션은 컬렉션 자체의 구조는 변경할 수 없지만 컬렉션에 저장된 객체의 내용은 변경할 수 있습니다. 예를 들어, 불변 리스트 내부에 문자열 객체가 있다면 해당 문자열 객체의 내용은 변경 가능하지만, 불변 리스트의 크기나 요소 순서는 변경할 수 없습니다. 이러한 특성을 이해하고 사용할 때 주의해야 합니다. 


#### List

자바에서의 `List`를 Kotlin에서 어떻게 작성하는지 비교하여 설명하겠습니다.


**자바에서의 리스트:**

```kotlin

public static void main(String[] args) {  
  
	final List<Integer> numbers= Arrays.asList(100,200,300);  
}
```


**Kotlin에서의 리스트:**
```kotlin

fun main() {  
  
  
	val numbers = listOf<Int>(100,200,300)   
	
	//var numbers = mutableListOf<Int>(100, 200, 300) //가변으로 하고 싶다면
  
	val emptyList= emptyList<Int>()   //비어있는 리스트 선언
  
}
```

1. 자바에서 리스트를 선언할 때는 `List<Integer>`와 같이 타입을 명시하고, `Arrays.asList(100, 200, 300)`와 같이 요소를 초기화합니다.
    
2. Kotlin에서는 `listOf<Int>(100, 200, 300)`와 같이 리스트를 선언합니다. 가변이라면 `mutableListOf<Int>(100, 200, 300)`와 같이 작성하면 됩니다.  Kotlin에서는 타입 추론이 가능하므로 타입 추론이 된다면 `<Int>` 부분은 생략해도 됩니다.
    
3. 빈 리스트를 선언하려면 Kotlin에서 `emptyList<Int>()`와 같이 `emptyList` 함수를 사용하여 빈 리스트를 생성할 수 있습니다.

##### List 활용 예시

그럼 이제 기본적인 자바에서의 `List` 활용과 Kotlin에서 어떻게 활용하는지 비교하여 설명하겠습니다.


**자바에서의 리스트 활용:**

```kotlin

final List<Integer> numbers = Arrays.asList(100, 200, 300);

// 요소 하나 가져오기
System.out.println(numbers.get(0));

// For each
for (int number : numbers) {
    System.out.println(number);
}

// 전통적인 for문
for (int i = 0; i < numbers.size(); i++) {
    System.out.printf("%s %s", i, numbers.get(i));
}

```
<br>


**Kotlin에서의 리스트 활용:**
```kotlin

fun main() {

    val numbers = listOf(100, 200, 300)
    
	//var numbers = mutableListOf<Int>(100, 200, 300) //가변으로 하고 싶다면
	
    // 요소 하나 가져오기
    println(numbers[0])

    // For each (for-in loop)
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for문 (인덱스와 값을 함께 출력)
    for ((index, value) in numbers.withIndex()) {
        println("$index $value")
    }
}

```


1. 리스트 요소에 접근할 때 자바의 `numbers.get(0)` 대신 Kotlin에서는 `numbers[0]`으로 접근합니다.
    
2. Kotlin에서는 `for (element in numbers)` 또는 `numbers.forEach { element -> ... }` 와 같이 간결한 방법으로 리스트를 순회할 수 있습니다.
    
3. 전통적인 for문 역시 Kotlin에서도 사용할 수 있으며, `withIndex()` 함수를 통해 인덱스와 값을 함께 가져올 수 있습니다.

<br>

#### Set

Set은 List와 다르게 순서가 없고 같은 요소는 중복으로 포함되지 않습니다.
이러한 자료구조적 의미만 제외하면 모든 기능이 List와 비슷합니다.

<br>


**자바에서의 Set**

```kotlin

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Set 생성
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(100);
        uniqueNumbers.add(200);
        uniqueNumbers.add(300);
        uniqueNumbers.add(200); // 중복된 요소는 추가되지 않음

        // Set 크기 확인
        System.out.println("Set의 크기: " + uniqueNumbers.size());

        // Set 순회
        for (Integer number : uniqueNumbers) {
            System.out.println(number);
        }

        // Set에 요소 추가/제거
        uniqueNumbers.add(400);
        uniqueNumbers.remove(300);
        System.out.println(uniqueNumbers); // [100, 200, 400]
    }
}
```

<br>


**Kotlin에서의 Set 활용:**

```kotlin

fun main() {
    // Set 생성
    val uniqueNumbers = setOf(100, 200, 300, 200) // 중복된 요소는 하나로 처리

    // Set의 크기 확인
    println("Set의 크기: ${uniqueNumbers.size}")

    // Set 순회
    for (number in uniqueNumbers) {
        println(number)
    }

	// 전통적인 for문 (인덱스와 값을 함께 출력)
    for ((index, value) in numbers.withIndex()) {
        println("$index $value")
    }

    // Set에 요소 추가/제거 (가변 Set)
    val mutableSet = mutableSetOf<Int>()
    mutableSet.add(400)
    mutableSet.remove(300)
    println(mutableSet) // [100, 200, 400]
}

```

위의 자바 코드와 코틀린 코드는 비슷한 기능을 수행하지만 문법적인 차이가 있습니다. 코틀린에서는 중복된 요소를 `setOf`로 생성할 때 자동으로 하나로 처리하므로 중복이 제거됩니다. 가변 Set은 `mutableSetOf`를 사용하여 선언하고 활용합니다.

<br>

#### Map

Java와 동일하게 맵(Map)은 키-값(key-value) 쌍을 저장하는 자료구조이다.  간단하게 예제로 설명하겠습니다.


**자바에서의 Map**

```kotlin
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    
        // Map 생성
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Alice", 90);
        scoreMap.put("Bob", 85);
        scoreMap.put("Charlie", 95);

        // Map 크기 확인
        System.out.println("Map의 크기: " + scoreMap.size());

        // Map 요소 조회
        int aliceScore = scoreMap.get("Alice");
        System.out.println("Alice의 점수: " + aliceScore);

        // Map 순회
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + ": " + score);
        }

        // Map에 요소 추가/제거
        scoreMap.put("David", 88);
        scoreMap.remove("Bob");
        System.out.println(scoreMap); // {Alice=90, Charlie=95, David=88}
    }
}
```

**Kotlin에서의 Map 활용:**

```kotlin

fun main() {

    // Map 생성
    val scoreMap = mapOf(
        "Alice" to 90,
        "Bob" to 85,
        "Charlie" to 95
    )
    // Map의 크기 확인
    println("Map의 크기: ${scoreMap.size}")

    // Map 요소 조회
    val aliceScore = scoreMap["Alice"]
    println("Alice의 점수: $aliceScore")

    // Map 순회
    for ((name, score) in scoreMap) {
        println("$name: $score")
    }
    // Map의 키 순회
    for (name in scoreMap.keys) {
        println("Key: $name")
    }
    // Map의 값 순회
    for (score in scoreMap.values) {
        println("Value: $score")
    }
    // Map에 요소 추가/제거 (가변 Map)
    val mutableMap = mutableMapOf<String, Int>()
    mutableMap["David"] = 88
    mutableMap.remove("Bob")
    println(mutableMap) // {Alice=90, Charlie=95, David=88}
}

```


 키-값(key-value) 쌍으로도 가능하고 아니면 따로 호출 또는 순회 가능하다.
<br>

### Collection null 처리 방법 및 Java와 함께 사용하기

코틀린에서 컬렉션을 다룰 때 `null` 처리는 중요한 주제 중 하나입니다. 아래에서 `List`를 예로 들어 컬렉션에서의 `null` 처리 방법과 Java와 함께 사용 시 주의사항을 설명하겠습니다.

1. **`List<Int?>`**: 이 경우, `List`에는 `null`이 들어갈 수 있지만, `List` 자체는 절대 `null`이 아닙니다. 즉, 리스트가 비어있는 것이나 null인 것을 나타내지 않습니다.
    
2. **`List<Int>?`**: `List`에 `null`이 들어갈 수 없지만, `List` 자체가 `null`일 수 있습니다. 따라서 이 경우에는 리스트가 존재하지 않을 수 있음을 의미합니다.
    
3. **`List<Int?>?`**: `List`에 `null`이 들어갈 수 있고, `List` 자체가 `null`일 수도 있습니다.

**Java 컬렉션과 Kotlin: 주의사항**

Java 컬렉션과 Kotlin을 함께 사용할 때 주의해야 할 몇 가지 중요한 사항이 있습니다. Java에서는 읽기 전용(Immutable) 컬렉션과 변경 가능한(Mutable) 컬렉션을 명확하게 구분하지 않습니다. 이로 인해 Kotlin에서 Java 컬렉션을 가져올 때 불변 객체(Immutable)에 객체를 추가하려고 시도하면 오류가 발생할 수 있습니다. 따라서 Kotlin에서 Java 컬렉션을 사용할 때 컬렉션 내용이 변경될 수 있음을 염두에 두어야 합니다.
해결 방법은 다음과 같습니다:

1. **변경 불가능한 Kotlin 컬렉션 사용**: Kotlin은 변경 불가능한 컬렉션을 지원하므로, Java 컬렉션을 Kotlin으로 가져올 때 불변 컬렉션으로 변환하는 것이 좋습니다. 이렇게 하면 Java 컬렉션 내용을 변경하지 못하게 됩니다.
    
    
2. **`Collections.unmodifiableXXX()` 메서드 활용**: Java에서는 `Collections.unmodifiableXXX()` 메서드를 사용하여 읽기 전용 래퍼(Wrapper)를 생성할 수 있습니다. 이를 활용하면 Java 컬렉션을 Kotlin에서 변경하지 못하도록 할 수 있습니다.
    
    
    
3. **플랫폼 타입 주의**: Kotlin에서는 플랫폼 타입을 사용하는 경우도 있습니다. 플랫폼 타입은 Java와 Kotlin 간의 상호 운용성을 위한 타입이며, 널(null) 여부를 알 수 없습니다. 플랫폼 타입을 다룰 때는 널 여부에 주의해야 합니다.


<br>


## Kotlin에서 다양한 함수를 다루는 방법


<br>

### 확장 함수

Kotlin은 Java와의 호환성을 중요하게 생각하는 언어로, 기존의 Java 코드와 자연스럽게 혼용할 수 있도록 설계되었습니다. 그 중 한 가지 유용한 기능이 바로 "확장 함수(Extension Functions)"입니다. 확장 함수는 Kotlin에서 기존 클래스의 메서드처럼 호출할 수 있지만, 클래스 외부에서 함수를 추가로 정의할 수 있도록 해주는 개념입니다.

확장 함수의 핵심 아이디어는 다음과 같습니다:

1. **기존 클래스에 메서드를 추가하고 싶을 때**: Java 클래스를 상속받지 않고도 해당 클래스에 새로운 메서드를 추가할 수 있습니다. 이는 기존 Java 라이브러리나 클래스를 Kotlin에서 더 풍부하게 활용할 수 있게 해줍니다.
    
2. **클래스 확장의 범위 제한**: 확장 함수를 특정 클래스에만 적용하려면, 해당 클래스의 이름과 함께 함수를 정의합니다. 이렇게 하면 다른 클래스에는 영향을 미치지 않고 특정 클래스에만 확장 함수를 사용할 수 있습니다.
    

예를 들어, 다음은 `String` 클래스에 `lastChar()`라는 확장 함수를 추가하는 Kotlin 코드의 예시입니다:

```kotlin

fun String.lastChar():Char{  
	return this[this.length-1]  
}

fun main() {
    val text = "Hello, Kotlin!"
	println(text.lastChar())
}

```

이 코드에서 `String` 클래스에 `lastChar()` 확장 함수를 추가했습니다. 그 결과로, `text` 문자열 객체는 이 함수를 호출할 수 있게 됩니다.

<br>

확장 함수의 특징을 요약하면 다음과 같습니다:

1. **기존 클래스에 메서드 추가**: `String` 클래스를 직접 수정하지 않고도 `lastChar()`라는 함수를 `String` 객체에서 호출할 수 있게 됩니다.
    
2. **멤버 함수와 동일한 호출**: 확장 함수를 사용하면 마치 클래스의 멤버 함수처럼 호출할 수 있으며, 해당 클래스의 객체를 `this` 을 활용하여 수신 객체(receiver)로 사용할 수 있습니다.
    
3. **캡슐화 유지**: 클래스의 `private` 또는 `protected` 멤버에 접근할 수 없으므로, 캡슐화를 유지하면서도 클래스 기능을 확장할 수 있습니다.
    
4. **멤버 함수와 충돌**: 확장 함수의 이름이 클래스의 멤버 함수와 충돌할 경우, 클래스의 멤버 함수가 우선적으로 호출됩니다.
    
5. 호출 기준 : 확장 함수는 현재 타입을 기준으로 호출됩니다. 만약에 현재 타입을 상위 타입으로 하고 호출하게 되면 상위 타입의 확장 함수를 호출합니다. 


### infix 함수


Kotlin에서는 Infix 함수를 사용하여 중위 표기법(infix notation)으로 함수를 호출할 수 있습니다. Infix 함수는 다음과 같은 특징을 가집니다.

1. 중위 표기법으로 호출할 수 있습니다.
2. 확장 함수 혹은 멤버 함수로 정의할 수 있습니다.
3. 단일 매개변수를 받아야 합니다.
4. 클래스 멤버 함수는 infix 함수로 선언할 수 없습니다.

예제로 Infix 함수를 만들고 호출하는 방법을 살펴보겠습니다.
 
```kotlin
// Infix 함수 정의
infix fun Int.plusFive(x: Int): Int {
    return this + x + 5
}

fun main() {
    val result = 10 plusFive 20 // Infix 함수 호출
    println("Result: $result") // 출력: Result: 35
}
```

 위의 코드에서 `plusFive`라는 Infix 함수를 정의하고, 이를 중위 표기법으로 호출하고 있습니다. Infix 함수의 이름은 백틱으로 감싸지 않고 함수 이름과 동일한 역할을 합니다. 함수 내부에서는` this`를 사용하여 첫 번째 인자를 참조할 수 있습니다.

중위 표기법을 사용하면 코드가 더 가독성 있고 자연스러워질 수 있으며, 특히 수학 연산과 같은 경우에 유용하게 활용할 수 있습니다.


### inline 함수


Kotlin에서 `inline` 함수는 함수 호출 시 함수 내용을 호출 지점에 복사(inline)하여 실행하는 함수입니다. 이렇게 함으로써 함수 호출로 인한 성능 오버헤드를 줄일 수 있으며, 람다 함수를 인라인 함수로 사용할 때 람다의 실행을 최적화할 수 있습니다.


예제로 `inline` 함수를 만들고 활용하는 방법을 살펴보겠습니다.

``` kotlin
// inline 함수 정의
inline fun measureTimeMillis(block: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - startTime
}

fun main() {
    val executionTime = measureTimeMillis {
        // 실행 시간을 측정하고자 하는 코드 블록
        for (i in 1..1000000) {
            // 작업 수행
        }
    }

    println("Execution time: $executionTime ms")
}
```

위의 코드에서 `measureTimeMillis` 함수는 `inline`으로 선언되어 있습니다. 이 함수는 코드 블록(`block`)을 받아와서 해당 블록의 실행 시간을 측정하고 반환합니다.

`inline` 함수를 사용하면 함수 호출로 인한 오버헤드를 줄일 수 있으며, 함수 인자로 람다를 전달할 때 람다의 실행을 최적화할 수 있어서 성능 개선에 유용합니다. 하지만 `inline` 함수의 사용은 성능 측정과 함께 신중하게 사용해야 합니다.

<br>

### 지역 함수

Kotlin에서는 함수 내부에 다른 함수를 정의할 수 있습니다. 이렇게 함수 내부에서 정의된 함수를 "지역 함수"라고 합니다. 지역 함수는 외부에서는 접근할 수 없으며, 주로 바깥 함수 내에서만 사용되는 보조 함수를 정의할 때 유용합니다.

예제로 지역 함수를 만들고 활용하는 방법을 살펴보겠습니다.

```kotlin
fun main() {
    fun greet(name: String) {
        println("Hello, $name!")
    }

    greet("Alice")
    greet("Bob")
    greet("Charlie")
}

```

위의 코드에서 `greet` 함수는 `main` 함수 내에서 정의된 지역 함수입니다. 이 함수는 `main` 함수 내부에서만 사용할 수 있으며, 여러 번 호출되어 다양한 이름에 대한 인사말을 출력합니다.

함수로 추출하면 좋을 것 같은데 이 함수를 지금 함수 내에서만 사용하고 싶을 때 주로 사용합니다. 하지만 depth가 깊어지기도 하고 , 코드가 그렇게 깔끔하지가 않다는 단점이 있습니다.

<br>

## Kotlin 에서 람다를 다루는 방법

<br>

### Java에서의 람다

Java에서 람다를 도입하여 코드를 간결화하고, 함수형 인터페이스를 활용하여 복잡한 동작을 다루며, 스트림 API를 통해 데이터 처리를 간편하게 하였습니다. 이로써 코드 가독성을 향상시키고, 메소드 레퍼런스를 사용하여 메소드를 변수에 할당하거나 파라미터로 전달할 수 있게 되었습니다.

<br>


### Kotlin에서의 람다

코틀린과 자바는 한 가지 중요한 차이점이 있습니다:

- 코틀린에서는 함수가 값(value) 그 자체로 취급됩니다.
- 함수를 변수에 할당할 수 있습니다.
- 함수를 파라미터로 넘길 수 있습니다.

"사과인지를 체크하는 함수"를 만드는 두 가지 방법(람다를 사용하는 방법)이 있습니다:

```kotlin
fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val isApple1 = fun(fruit: Fruit): Boolean { // (1)
        return fruit.name == "사과"
    }

    val isApple2 = { 
    fruit: Fruit -> fruit.name == "사과"
    } // (2)
}

```

(1) 일반적인 함수를 만드는 방법으로 함수 이름을 표시하지 않습니다.

(2) 중괄호와 화살표를 사용하는 방법입니다.

이 함수를 호출할 때 다음과 같은 방법으로 호출할 수 있습니다:

```scss
isApple(fruits[0])
isApple.invoke(fruits[0])
```

또한 함수를 변수에 할당할 수 있으며 해당 변수에는 타입이 지정됩니다:

```kotlin
val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
    return fruit.name == "사과"
}
```

여기서 `(Fruit) -> Boolean`은 Fruit 타입을 받아서 Boolean 값을 반환하는 함수 타입을 나타냅니다. 즉, 함수의 타입은 `(파라미터 타입…) -> 반환타입`입니다.

또한, 함수를 파라미터로 받을 수 있는 특징을 활용하여 함수 타입을 파라미터로 명시할 수 있습니다:

```kotlin
private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean // (1)
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}
```

(1) 이런 식으로 코틀린에서는 함수를 파라미터로 받을 수 있어서 파라미터에 함수 타입을 명시할 수 있습니다.

이러한 람다를 활용하면 코드를 간결하게 작성하고 다음과 같이 사용할 수 있습니다:

```kotlin
fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val isApple = { fruit: Fruit -> fruit.name == "사과" } // (1)

    val results = filterFruits(fruits, isApple) // (2)

    results.forEach {
        println(it.name) // 사과만 나온다.
    }
}
```

(1) (Fruit) → Boolean 함수 타입의 함수를 만들어 변수에 할당합니다.

(2) 만든 isApple 함수를 파라미터로 전달하여 활용합니다.

람다를 활용하면 코틀린 코드를 간결하게 작성할 수 있으며, 파라미터로 함수를 전달하는 등의 유연한 기능을 제공합니다.


<br>

### Closure 

코틀린에서의 람다는 한 번 정의된 후에는 내부 변수 값이 변하더라도 사용할 수 있습니다. 이것이 가능한 이유는 코틀린에서는 람다가 **클로저(closure)**로 동작하기 때문입니다.

클로저란 함수 내부에서 선언된 변수를 외부에서 접근할 수 있도록 하는 개념입니다. 따라서 코틀린의 람다는 람다 내부에서 외부 변수를 "포획(capture)"하여 사용할 수 있습니다. 이때 람다가 포획한 변수는 람다 내부에서 값이 변하더라도 여전히 람다에 영향을 미칩니다.

간단한 예시를 통해 설명하겠습니다:

```kotlin
fun main() {
    var x = 10 // 외부 변수 x 선언

    val printX = { println(x) } // 람다가 외부 변수 x를 포획

    x = 20 // x 값 변경

    printX() // 결과: 20, 람다는 변경된 x 값을 사용
}
```

위 코드에서 `printX` 람다는 외부 변수 `x`를 포획하여 사용합니다. 그런데 `x`의 값은 람다가 호출되기 전에 변경되었지만, 람다 내부에서 `x`는 항상 최신 값인 20을 사용합니다. 이것이 클로저의 동작 원리로, 람다가 정의될 때 외부 변수의 값을 기억하고 있는 것입니다.

따라서 코틀린에서 람다를 사용할 때는 람다가 정의된 시점의 외부 변수를 포획하므로, 람다 내부에서 값이 변하더라도 올바르게 동작합니다.

<br>

## Kotlin에서 컬렉션을 함수형으로 다루는 방법

<br>

### 필터와 맵

```kotlin

package lec03

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    // "사과"만 필터링합니다.
    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // 필터링할 때 인덱스를 함께 사용하려면 `filterIndexed`를 사용합니다.
    fruits.filterIndexed { index, fruit ->
        println(index)
        fruit.name == "사과"
    }

    // "사과"의 가격 정보만 추출합니다.
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }.map { fruit -> fruit.price }

    // 매핑할 때 인덱스를 함께 사용하려면 `mapIndexed`를 사용합니다.
    fruits.filter { fruit -> fruit.name == "사과" }.mapIndexed { index, fruit ->
        println(index)
        fruit.price
    }
}

data class Fruit(
    val name: String,
    val price: Int
)

```

위의 Kotlin 코드는 과일 목록을 필터링하고 매핑하는 예제입니다. 코드를 개행하고 설명해보겠습니다.

1. `val apples = fruits.filter { fruit -> fruit.name == "사과" }`: 이 부분에서는 "사과" 이름을 가진 과일만 필터링하여 `apples` 변수에 저장합니다.
    
2. `fruits.filterIndexed { index, fruit -> ... }`: `filterIndexed` 함수를 사용하여 필터링할 때 인덱스를 함께 사용할 수 있습니다. 인덱스와 함께 필터링 조건을 확인하고 출력합니다.
    
3. `val applePrices = fruits.filter { ... }.map { ... }`: "사과"만 필터링한 후, `map` 함수를 사용하여 "사과"의 가격 정보만 추출하여 `applePrices` 변수에 저장합니다.
    
4. `fruits.filter { ... }.mapIndexed { index, fruit -> ... }`: `mapIndexed` 함수를 사용하여 매핑할 때 인덱스를 함께 사용할 수 있습니다. 인덱스와 함께 가격 정보를 확인하고 출력합니다.

<br>


### 다양한 컬렉션 처리 기능


```kotlin

// 모든 요소가 조건을 만족하는지 확인 (all)
val allApples = fruits.all { fruit -> fruit.name == "사과" }


// 모든 요소가 조건을 불만족하는지 확인 (none)
val noneApples = fruits.none { fruit -> fruit.name == "사과" }


// 하나 이상의 요소가 조건을 만족하는지 확인 (any)
val anyExpensive = fruits.any { fruit -> fruit.price >= 1000 }


// 요소 개수 세기 (count)
val totalFruits = fruits.count()


// 이름을 기준으로 오름차순 정렬 (sortedBy)
val sortedByName = fruits.sortedBy { fruit -> fruit.name }


// 이름을 기준으로 내림차순 정렬 (sortedByDescending)
val sortedByNameDesc = fruits.sortedByDescending { fruit -> fruit.name }


// 이름을 기준으로 중복 제거 후 이름만 추출 (distinctBy)
val uniqueNames = fruits.distinctBy { fruit -> fruit.name }.map { fruit -> fruit.name }


// 첫 번째 요소 가져오기 (무조건 null이 아니어야 함)
val firstFruit = fruits.first()

// 첫 번째 요소 가져오기 (또는 null)
val firstOrNullFruit = fruits.firstOrNull()

// 마지막 요소 가져오기 (무조건 null이 아니어야 함)
val lastFruit = fruits.last()


// 마지막 요소 가져오기 (또는 null)
val lastOrNullFruit = fruits.lastOrNull()

```

위의 Kotlin 코드는 다양한 컬렉션 처리 기능을 보여줍니다. 각 함수의 역할은 다음과 같습니다:

- `all`: 모든 요소가 주어진 조건을 만족하면 `true`, 그렇지 않으면 `false`를 반환합니다.
- `none`: 모든 요소가 주어진 조건을 불만족하면 `true`, 그렇지 않으면 `false`를 반환합니다.
- `any`: 하나 이상의 요소가 주어진 조건을 만족하면 `true`, 그렇지 않으면 `false`를 반환합니다.
- `count`: 컬렉션의 요소 개수를 반환합니다.
- `sortedBy`: 주어진 표현식을 기준으로 요소를 오름차순으로 정렬합니다.
- `sortedByDescending`: 주어진 표현식을 기준으로 요소를 내림차순으로 정렬합니다.
- `distinctBy`: 주어진 표현식을 기준으로 중복된 요소를 제거합니다.
- `first`: 첫 번째 요소를 반환합니다 (무조건 null이 아니어야 함).
- `firstOrNull`: 첫 번째 요소를 반환하거나, 요소가 없을 경우 null을 반환합니다.
- `last`: 마지막 요소를 반환합니다 (무조건 null이 아니어야 함).
- `lastOrNull`: 마지막 요소를 반환하거나, 요소가 없을 경우 null을 반환합니다.

이러한 함수들을 사용하여 컬렉션을 다양하게 처리할 수 있습니다.

<br>


### List를 Map으로


```kotlin

// List를 Map으로 변환하는 예제

// List를 name을 키로 하는 Map으로 그룹화 (groupBy)
val groupBy = fruits.groupBy { fruit -> fruit.name }

// List를 id를 키로 하는 Map으로 변환 (associateBy)
val associateBy = fruits.associateBy { fruit -> fruit.id }


val map: Map<String, List<Long>> = fruits
    .groupBy({ fruit -> fruit.name }, { fruit -> fruit.currentPrice })

val map: Map<Long, Long> = fruits
    .associateBy({ fruit -> fruit.id }, { fruit -> fruit.currentPrice })

```

위의 Kotlin 코드에서는 List를 Map으로 변환하는 두 가지 방법을 보여줍니다.

1. **`groupBy`를 사용한 그룹화**: `groupBy` 함수를 사용하여 List를 그룹화하고 Map으로 변환합니다. 주어진 표현식 또는 속성을 기준으로 List의 요소들을 그룹화하고, 각 그룹을 Map의 키로 사용합니다. 예를 들어, `fruits` 리스트를 과일의 이름(`name`)을 기준으로 그룹화한 결과를 `groupBy` 변수에 할당합니다. 이렇게 하면 Map의 키는 각 과일의 이름이 되고, 값은 해당 이름을 가진 과일들의 리스트가 됩니다.
    
2. **`associateBy`를 사용한 변환**: `associateBy` 함수를 사용하여 List의 각 요소를 Map으로 변환합니다. 주어진 표현식 또는 속성을 기준으로 List의 각 요소를 Map의 키로 사용합니다. 예를 들어, `fruits` 리스트의 각 과일을 해당 과일의 `id`를 기준으로 Map으로 변환한 결과를 `associateBy` 변수에 할당합니다. 이렇게 하면 Map의 키는 각 과일의 `id`가 되고, 값은 해당 과일이 됩니다.
    
3. **`groupBy`와 `map`을 조합한 예**: `groupBy` 함수로 그룹화한 뒤, `map` 함수를 사용하여 그룹화된 결과에서 원하는 정보(`currentPrice`)를 추출합니다.
    
4. **`associateBy`와 `map`을 조합한 예**: `associateBy` 함수로 각 요소를 Map으로 변환한 뒤, `map` 함수를 사용하여 원하는 정보(`currentPrice`)를 추출합니다.


이러한 함수들을 사용하여 List와 Map 간의 변환을 손쉽게 수행할 수 있습니다.

<br>


### 중첩된 컬렉션 처리


`flatMap`을 사용하면 `List<List>`를 단일 `List`로 변환할 수 있습니다. 아래 예제를 통해 이를 설명해보겠습니다.

```kotlin
val fruitsInList: List<List<Fruit>> = listOf(
	listOf(
    	Fruit(1L, "사과", 1_000, 1_500),
        Fruit(2L, "사과", 1_200, 1_500),
        Fruit(3L, "사과", 1_200, 1_500),
        Fruit(4L, "사과", 1_500, 1_500),
    ),
    listOf(
    	Fruit(5L, "바나나", 3_000, 3_200),
        Fruit(6L, "바나나", 3_200, 3_200),
        Fruit(7L, "바나나", 2_500, 3_200),
    ),
    listOf(
    	Fruit(8L, "수박", 10_000, 10_000),
    )
)


```

위의 `fruitsInList`를 `flatMap`을 사용하여 다음과 같이 하나의 리스트로 평탄화할 수 있습니다.

``` kotlin
val samePriceFruits = fruitsInList.flatMap { list ->
	list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
}
```

이렇게 하면 `samePriceFruits`는 `List<Fruit>` 형태가 됩니다. `flatMap`은 각 그룹(`List<Fruit>`)에 대해 내부적으로 `filter`를 사용하여 공장 가격(`factoryPrice`)과 현재 가격(`currentPrice`)이 같은 과일들을 추출하고, 이를 모두 단일 리스트로 합칩니다.

또한, `Fruit` 클래스에 `isSamePrice`라는 속성을 추가하여 공장 가격과 현재 가격이 같은지 여부를 쉽게 확인할 수 있게 했습니다. 그런 다음 확장 프로퍼티(`samePriceFilter`)를 사용하여 동일한 가격의 과일을 필터링할 수 있습니다.

```kotlin
data class Fruit(
	val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
	val isSamePrice: Boolean 
    	get() = factoryPrice == currentPrice
}

val List<Fruit>.samePriceFilter = List<Fruit>
	get() = this.filter(Fruit::isSamePrice)
```

이렇게하면 다음과 같이 더 간결하게 동일한 가격의 과일을 필터링할 수 있습니다.

```kotlin
val samePriceFruits = fruitsInList.flatMap { list -> list.samePriceFilter }
```

마지막으로, `fruitsInList.flatten()`을 사용하면 `List<List<Fruit>>`를 평탄화하여 하나의 리스트로 변환할 수 있습니다. 

```kotlin
fruitsInList.flatten()
```
