
## 🌱Spring 源码阅读系列

+ Spring Core
  + 资源加载与访问
    - ✅ [Resource](spring-resources/spring-resource/README.md)：抽象接口，表示文件、类路径等，用于访问不同来源的资源。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [ResourceLoader](spring-resources/spring-resource-resourceLoader/README.md)：资源获取核心接口，实现统一加载不同位置资源的策略。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [ResourcePatternResolver](spring-resources/spring-resource-resourcePatternResolver/README.md)：资源模式解析接口，用于灵活加载应用中的多种资源。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [DocumentLoader](spring-resources/spring-resource-documentLoader/README.md)：XML文档加载解析核心接口，支持后台自动配置Spring应用。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>

  + 元数据与过滤
    - ✅ [MetadataReader](spring-metadata/spring-metadata-metadataReader/README.md)：类元数据获取核心，支持组件扫描、条件化注解、AOP等高级功能。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [AnnotationMetadata](spring-metadata/spring-metadata-annotationMetadata/README.md)：动态获取和操作运行时类注解信息。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [TypeFilter](spring-metadata/spring-metadata-typeFilter/README.md)：组件扫描时自定义类筛选，支持复杂条件和精确过滤。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [Condition](spring-metadata/spring-metadata-condition/README.md)：条件判断，决定Bean创建和配置的灵活机制。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>

  + 验证、数据绑定和类型转换
    - ✅ [Validator](spring-dataops/spring-dataops-validator/README.md)：提供自定义数据验证逻辑，确保模型对象满足业务规则。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [PropertyEditor](spring-dataops/spring-dataops-propertyEditor/README.md)：自定义JavaBean属性的转换逻辑，处理属性类型转换。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [Converter](spring-dataops/spring-dataops-converter/README.md)：用于不同类型间的转换，定义简单的源至目标类型转换规则。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [ConverterFactory](spring-dataops/spring-dataops-converterFactory/README.md)：创建针对特定源类型的转换器，用于类型转换。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [GenericConverter](spring-dataops/spring-dataops-genericConverter/README.md)：更复杂的转换器，支持多种源和目标类型转换。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [ConditionalConverter](spring-dataops/spring-dataops-conditionalConverter/README.md)：根据条件选择是否执行转换的转换器。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [ConversionService](spring-dataops/spring-dataops-conversionService/README.md)：提供统一的类型转换服务接口，管理转换器。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [Printer](spring-dataops/spring-dataops-printer/README.md)：用于将对象格式化为文本，专注于格式化输出。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [Parser](spring-dataops/spring-dataops-parser/README.md)：用于将文本解析为对象，专注于解析逻辑。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>

  + Spring 表达式语言（SpEL）
    - ✅ [ExpressionParser](spring-spel/spring-spel-expressionParser/README.md): 解析字符串形式的 SpEL 表达式，创建并返回 Expression 实例。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - ✅ [Expression](spring-spel/spring-spel-expression/README.md): 对表达式字符串进行求值的功能，支持类型转换、获取原始字符串等操作。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - ✅ [EvaluationContext](spring-spel/spring-spel-evaluationContext/README.md): 管理SpEL表达式的上下文信息。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [PropertyAccessor](spring-spel/spring-spel-propertyAccessor/README.md): 用于读取和写入对象的属性，可用于实现自定义的属性访问逻辑。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [ConstructorResolver](spring-spel/spring-spel-constructorResolver/README.md): 解析构造函数确定bean的实例化方式。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [MethodResolver](spring-spel/spring-spel-methodResolver/README.md): 解析类方法，确保正确调用，处理重载和参数匹配。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [BeanResolver](spring-spel/spring-spel-beanResolver/README.md): 解析bean定义，包括依赖、属性设置，实例化并返回。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [TypeLocator](spring-spel/spring-spel-typeLocator/README.md): 动态查找类，返回Class对象，在表达式解析、类型转换等。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [TypeConverter](spring-spel/spring-spel-typeConverter/README.md): 类型转换功能，将表达式中的数据从一种类型转换为另一种类型。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [TypeComparator](spring-spel/spring-spel-typeComparator/README.md): 类型比较功能，定义了比较两个对象是否相等的方法。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [OperatorOverloader](spring-spel/spring-spel-operatorOverloader/README.md): 运算符重载功能，对表达式中的运算符进行自定义操作的方法。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>

  + Bean定义与注册
    - ✅ [BeanDefinition](spring-beans/spring-bean-beanDefinition/README.md)：详细描述Bean，支持依赖注入、AOP、作用域控制等核心功能。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [BeanDefinitionHolder](spring-beans/spring-bean-beanDefinitionHolder/README.md)：管理和操作BeanDefinition的关键类。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - ✅ [BeanDefinitionRegistry](spring-beans/spring-bean-beanDefinitionRegistry/README.md)：Bean定义注册管理关键接口，处理Bean元数据。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>

  + Bean定义读取与扫描
    - ✅ [XmlBeanDefinitionReader](spring-beans/spring-bean-xmlBeanDefinitionReader/README.md)：加载解析XML配置，构建IOC容器，注册Bean定义。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - ✅ [PropertiesBeanDefinitionReader](spring-beans/spring-bean-propertiesBeanDefinitionReader/README.md)：属性文件加载，解析为Bean定义。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - ✅ [GroovyBeanDefinitionReader](spring-beans/spring-bean-groovyBeanDefinitionReader/README.md)：Groovy脚本解析为Bean定义。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - ✅ [AnnotatedBeanDefinitionReader](spring-beans/spring-bean-annotatedBeanDefinitionReader/README.md)：注解配置，自动扫描注册Spring组件，简化Bean定义配置。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - ✅ [ClassPathBeanDefinitionScanner](spring-beans/spring-bean-classPathBeanDefinitionScanner/README.md)：类路径扫描注册Spring Bean，支持自动装配。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>

  + Bean工厂
    - ✅ [BeanFactory](spring-factory/spring-factory-beanFactory/README.md)：Spring的核心接口，提供对Bean的配置、创建、管理的基本功能。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - ✅ [ListableBeanFactory](spring-factory/spring-factory-listableBeanFactory/README.md)：支持按类型获取Bean的集合。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - ✅ [HierarchicalBeanFactory](spring-factory/spring-factory-hierarchicalBeanFactory/README.md)：支持父子容器关系，实现Bean定义的层次结构。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - ✅ [ConfigurableBeanFactory](spring-factory/spring-factory-configurableBeanFactory/README.md)：提供对BeanFactory配置的扩展，如属性编辑器、作用域等。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AutowireCapableBeanFactory](spring-factory/spring-factory-autowireCapableBeanFactory/README.md)：Bean创建、初始化、注入、销毁的核心功能接口。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [ConfigurableListableBeanFactory](spring-factory/spring-factory-configurableListableBeanFactory/README.md)：支持配置和列表操作的可配置Bean工厂接口。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>

  + 容器上下文
    - [ClassPathXmlApplicationContext](spring-context/spring-context-classPathXmlApplicationContext/README.md)：类路径（classpath）加载 XML 配置文件的上下文。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [AnnotationConfigApplicationContext](spring-context/spring-context-annotationConfigApplicationContext/README.md)：注解配置类中加载配置信息的上下文。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - GenericApplicationContext：支持多种配置方式，XML、注解、手动注册的上下文。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>

  + Bean定义导入与组合
    - ImportBeanDefinitionRegistrar：运行时动态注册 Bean，实现灵活配置，扩展配置类功能。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>
    - ImportSelector：运行时动态导入配置类，实现条件选择和灵活配置。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>
    - DeferredImportSelector：运行时动态导入配置，支持条件选择和按组别延迟加载。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>

  + Bean生命周期
    - [Bean的定义注册过程](spring-core/spring-core-registerBeanDefinition)：加载与解析配置文件，注册解析Bean定义，类名、作用域、属性等。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [Bean的初始化过程](spring-core/spring-core-getBean/README.md)：实例化、属性注入、Aware回调、后置处理器、初始化方法调用。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [Bean的依赖解析过程](spring-core/spring-core-resolveDependency/README.md)：声明依赖，查找依赖，注入依赖，处理循环依赖，延迟依赖解析。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [Bean的销毁过程](spring-core/spring-core-destroyBean/README.md)：销毁方法调用，接口回调，后处理清理，通知触发，GC回收资源。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>

  + 属性解析和环境配置
    - [PropertySource](spring-env/spring-env-propertySource/README.md)：管理各种配置源的抽象类，支持灵活地加载和访问应用配置。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [PropertySources](spring-env/spring-env-propertySources/README.md)：用于统一管理和访问多个 PropertySource 实例，简化配置数据的处理。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [PropertyResolver](spring-env/spring-env-propertyResolver/README.md)：通用属性解析，获取配置值，处理属性缺失，简便灵活。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [ConfigurablePropertyResolver](spring-env/spring-env-configurablePropertyResolver/README.md)：属性解析配置，占位符设置，适应不同配置需求。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [Environment](spring-env/spring-env-environment/README.md)：应用环境表示，提供属性访问，支持配置文件，实现动态配置。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [ConfigurableEnvironment](spring-env/spring-env-configurableEnvironment/README.md)：动态配置应用环境，激活、默认配置，提升应用灵活性。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>

  + Bean初始化与扩展点
    - [InitializingBean](spring-interface/spring-interface-initializingBean/README.md)：提供Bean初始化时执行自定义逻辑的接口。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [DisposableBean](spring-interface/spring-interface-disposableBean/README.md)：定义Bean销毁前执行清理操作的接口。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [BeanDefinitionRegistryPostProcessor](spring-interface/spring-interface-beanDefinitionRegistryPostProcessor/README.md)：在容器启动时，对BeanDefinition动态修改或添加。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [BeanFactoryPostProcessor](spring-interface/spring-interface-beanFactoryPostProcessor/README.md)：在Bean实例化前，对BeanFactory进行全局修改或配置。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [BeanPostProcessor](spring-interface/spring-interface-beanPostProcessor/README.md)：在Bean初始化前后，进行自定义处理，可影响所有Bean。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [InstantiationAwareBeanPostProcessor](spring-interface/spring-interface-instantiationAwareBeanPostProcessor/README.md)：提供更深层次的实例化和属性注入控制。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [DestructionAwareBeanPostProcessor](spring-interface/spring-interface-destructionAwareBeanPostProcessor/README.md)： 允许在Bean销毁前进行额外的清理操作。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [MergedBeanDefinitionPostProcessor](spring-interface/spring-interface-mergedBeanDefinitionPostProcessor/README.md)：在合并Bean定义时对BeanDefinition进行处理。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [SmartInstantiationAwareBeanPostProcessor](spring-interface/spring-interface-smartInstantiationAwareBeanPostProcessor/README.md)：提供更智能的实例化控制。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [SmartInitializingSingleton](spring-interface/spring-interface-smartInitializingSingleton/README.md)：在所有单例Bean初始化完成后，执行自定义逻辑。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>

  + Aware接口系列
    - [BeanNameAware](spring-aware/spring-aware-beanNameAware/README.md)：让Bean获取自身在容器中的名字。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [BeanClassLoaderAware](spring-aware/spring-aware-beanClassLoaderAware/README.md)：允许Bean获取其类加载器。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [BeanFactoryAware](spring-aware/spring-aware-beanFactoryAware/README.md)：提供Bean获取所属的BeanFactory。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [EnvironmentAware](spring-aware/spring-aware-environmentAware/README.md)：允许Bean获取应用程序环境配置。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [EmbeddedValueResolverAware](spring-aware/spring-aware-embeddedValueResolverAware/README.md)：允许Bean解析嵌入式值占位符。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [ResourceLoaderAware](spring-aware/spring-aware-beanClassLoaderAware/README.md)：允许Bean获取资源加载器。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [ApplicationEventPublisherAware](spring-aware/spring-aware-applicationEventPublisherAware/README.md)：允许Bean发布应用程序事件。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [MessageSourceAware](spring-aware/spring-aware-messageSourceAware/README.md)：允许Bean获取消息源。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [ApplicationContextAware](spring-aware/spring-aware-applicationContextAware/README.md)：允许Bean获取应用程序上下文。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [ImportAware](spring-aware/spring-aware-importAware/README.md)：允许被导入的配置类获取导入它的类的信息。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>

  + 核心注解
    - [@Configuration](spring-annotation/spring-annotation-configuration/README.md)：声明类为配置类，定义Bean和Bean之间的依赖关系。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@ComponentScan](spring-annotation/spring-annotation-componentScan/README.md)：启用组件扫描，自动发现并注册标记为组件的类。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@Bean](spring-annotation/spring-annotation-bean/README.md)：在配置类中声明方法，返回Bean实例。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@Import](spring-annotation/spring-annotation-import/README.md)：引入其他配置类，将其Bean定义合并到当前容器。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@PropertySource](spring-annotation/spring-annotation-propertySource/README.md)：指定属性文件，加载外部配置到环境中。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@DependsOn](spring-annotation/spring-annotation-dependsOn/README.md)：指定Bean的依赖顺序，确保特定Bean在其他Bean之前初始化。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@Conditional](spring-annotation/spring-annotation-conditional/README.md)：根据条件决定是否创建Bean。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@Lazy](spring-annotation/spring-annotation-lazy/README.md)：指定Bean的延迟初始化，只有在首次使用时才创建。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@Value](spring-annotation/spring-annotation-value/README.md)：注入简单值或表达式到Bean的字段或方法参数。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [@Autowired](spring-annotation/spring-annotation-autowired/README.md)：自动装配Bean依赖。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - @Primary：指定在多个候选Bean中优先选择的首选Bean。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>
    - @Description：为Bean提供描述性信息。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>
    - @Role：为Bean提供角色提示，用于区分相似类型的Bean。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>
    - @Indexed： 标记Bean用于索引。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>
    - @Order：指定Bean的加载顺序。<img src="https://img.shields.io/badge/%E5%8D%B3%E5%B0%86%E6%9B%B4%E6%96%B0-339933"></img>

  + JSR规范
    - [@Inject](spring-jsr/spring-jsr330-inject/README.md)：JSR-330标准的依赖注入注解。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [@Named](spring-jsr/spring-jsr330-named/README.md)：JSR-330标准的命名注解。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [@Resource](spring-jsr/spring-jsr250-resource/README.md)：Java EE标准的资源注入注解。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [@Qualifier](spring-jsr/spring-jsr330-qualifier/README.md)：用于限定注入的Bean。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [@Scope](spring-jsr/spring-jsr330-scope/README.md)：指定Bean的作用域。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [@Singleton](spring-jsr/spring-jsr330-singleton/README.md)：指定Bean为单例。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [@PostConstruct](spring-jsr/spring-jsr250-postConstruct/README.md)：指定初始化方法。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [@PreDestroy](spring-jsr/spring-jsr250-preDestroy/README.md)：指定销毁方法。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>
    - [Provider](spring-jsr/spring-jsr330-provider/README.md)：Java标准库提供的通用Bean工厂接口。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF8C69"></img>

  + Spring AOP
    - [JDK动态代理](spring-aop/spring-aop-jdkProxy/README.md)：接口实现，动态生成代理类，处理方法调用，统一横切关注点。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [Cglib动态代理](spring-aop/spring-aop-cglibProxy/README.md)：基于字节码生成的库，无需接口，可拦截类方法并进行增强。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [ClassFilter](spring-aop/spring-aop-classFilter/README.md)：确定类是否匹配拦截条件。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [MethodMatcher](spring-aop/spring-aop-methodMatcher/README.md)：确定方法是否匹配拦截条件。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [Pointcut](spring-aop/spring-aop-pointcut/README.md)：定义切入点，匹配被拦截的方法。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [Advice](spring-aop/spring-aop-advice/README.md)：AOP中定义各种通知类型行为的核心接口。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
      - [MethodInterceptor](spring-aop/spring-aop-advice-methodInterceptor/README.md)：拦截方法执行，允许在前后添加额外逻辑。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
      - [MethodBeforeAdvice](spring-aop/spring-aop-advice-methodBeforeAdvice/README.md)：允许在方法调用之前插入自定义逻辑。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
      - [AfterReturningAdvice](spring-aop/spring-aop-advice-afterReturningAdvice/README.md)：允许在方法调用之后插入自定义逻辑。<<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
      - [ThrowsAdvice](spring-aop/spring-aop-advice-throwsAdvice/README.md)：异常通知，捕获方法抛出的异常，执行额外逻辑。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
      - [IntroductionInterceptor](spring-aop/spring-aop-advice-introductionInterceptor/README.md)：动态地向目标对象引入新的功能或属性。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [Advisor](spring-aop/spring-aop-advisor/README.md)：用于将通知和切点结合，实现切面编程的横切关注点。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [Advised](spring-aop/spring-aop-advised/README.md)：配置AOP代理的通知、通知器、目标等。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [ProxyFactory](spring-aop/spring-aop-proxyFactory/README.md)：一种便捷的方式来创建代理对象。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [AopProxyFactory](spring-aop/spring-aop-aopProxyFactory/README.md)：创建AOP代理工厂，支持JDK和CGLIB。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AopProxy](spring-aop/spring-aop-aopProxy/README.md)：创建和管理AOP代理对象。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [AdvisorChainFactory](spring-aop/spring-aop-advisorChainFactory/README.md)：创建Advisor链的工厂接口。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AdvisorAdapterRegistry](spring-aop/spring-aop-advisorAdapterRegistry/README.md)：适配各种Advice到AOP拦截器，注册和管理Advisor适配器。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AdvisorAdapter](spring-aop/spring-aop-advisorAdapter/README.md)：适配不同类型通知到拦截器链。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [ProxyMethodInvocation](spring-aop/spring-aop-proxyMethodInvocation/README.md)：AOP方法调用代理，处理拦截器链和方法调用。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [@EnableAspectJAutoProxy](spring-aop/spring-aop-enableAspectJAutoProxy/README.md)：启用AspectJ切面自动代理。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AnnotationAwareAspectJAutoProxyCreator](spring-aop/spring-aop-annotationAwareAspectJAutoProxyCreator/README.md)：创建AOP代理以应用AspectJ风格的切面。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [BeanFactoryAdvisorRetrievalHelper](spring-aop/spring-aop-beanFactoryAdvisorRetrievalHelper/README.md)：帮助检索并管理Spring AOP 中的 Advisor Beans。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [BeanFactoryAspectJAdvisorsBuilder](spring-aop/spring-aop-beanFactoryAspectJAdvisorsBuilder/README.md)：构建@AspectJ注解切面，生成Spring AOP Advisors。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AspectInstanceFactory](spring-aop/spring-aop-aspectInstanceFactory/README.md)：创建切面实例，支持多种实现方式。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [MetadataAwareAspectInstanceFactory](spring-aop/spring-aop-metadataAwareAspectInstanceFactory/README.md)：管理切面实例和元数据，支持多种实例化策略。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AspectJAdvisorFactory](spring-aop/spring-aop-aspectJAdvisorFactory/README.md)：创建AspectJ通知器实例，管理切面通知的创建和配置。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
    - [TargetSource](spring-aop/spring-aop-targetSource/README.md)：管理AOP代理对象的获取与释放。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [TargetSourceCreator](spring-aop/spring-aop-targetSourceCreator/README.md)：创建特殊的目标源，定制代理对象的创建和管理。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
    - [AopContext](spring-aop/spring-aop-aopContext/README.md)：获取Spring AOP代理对象的工具。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [ExposeInvocationInterceptor](spring-aop/spring-aop-exposeInvocationInterceptor/README.md)：暴露Spring AOP方法调用上下文的拦截器。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
    - [@EnableLoadTimeWeaving](spring-aop/spring-aop-enableLoadTimeWeaving/README.md)：启用Spring加载时编织。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
+ Spring 事务
  + [Connection](spring-transaction/spring-transaction-connection/README.md)：管理数据库连接，执行SQL，处理事务。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [DataSource](spring-transaction/spring-transaction-dataSource/README.md)：提供高效管理数据库连接的接口。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [DriverManager](spring-transaction/spring-transaction-driverManager/README.md)：管理和建立数据库连接的核心类。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [JdbcTemplate](spring-transaction/spring-transaction-jdbcTemplate/README.md)：简化了JDBC操作，提供了方便的数据库访问抽象。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [TransactionDefinition](spring-transaction/spring-transaction-transactionDefinition/README.md)：定义事务的传播行为和隔离级别。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [TransactionAttributeSource](spring-transaction/spring-transaction-transactionAttributeSource/README.md)：用于获取事务属性的策略接口。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [PlatformTransactionManager](spring-transaction/spring-transaction-platformTransactionManager/README.md)：用于管理和协调事务的生命周期和执行。<img src="https://img.shields.io/badge/Level-%E5%9B%B0%E9%9A%BE-%23FF3030"></img>
  + [TransactionTemplate](spring-transaction/spring-transaction-transactionTemplate/README.md)：简化事务管理，支持编程式事务控制与异常处理。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [SpringTransactionAnnotationParser](spring-transaction/spring-transaction-springTransactionAnnotationParser/README.md)：解析 `@Transactional`注解并转换为事务配置。<img src="https://img.shields.io/badge/Level-%E7%AE%80%E5%8D%95-0099ff"></img>
  + [TransactionInterceptor](spring-transaction/spring-transaction-transactionInterceptor/README.md)：事务拦截器，用于管理方法级别的事务处理。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>
  + [EnableTransactionManagement](spring-transaction/spring-transaction-enableTransactionManagement/README.md)：启用Spring的注解驱动事务管理。<img src="https://img.shields.io/badge/Level-%E4%B8%80%E8%88%AC-%23FF6347"></img>

+ Spring MVC
+ Spring OpenFeign
