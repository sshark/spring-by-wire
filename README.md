#Spring By Wire
A sample Spring application showing Spring components wired together with preferred or primary component using @Autowired, @Component and @Primary.

Spring allows classes to be wired together using annotations like @Autowired and @Component. Most of the time it is sufficient just to use @Autowired to tie the classes together or inject classes into another class.

Sometimes, there is a need to replace a standard component with a custom component without modifying the source code. Spring will fail if it finds there are more than 1 component of the same interface are  autowired to a variable. The trick is to mark 1 of the component as primary component i.e. @Primary in addition to @Component.

In this example, DefaultAllServices requires 2 components, ServiceA and ServiceB. It uses DefaultServiceA and DefaultServiceB, the default implementations, to fulfill ServiceA and ServiceB. Customized ServiceB implementation can be loaded by marking the customized implementation with @Primary and include the new class package for Spring to load. Spring will inject CustomServiceB into DefaultAllServices.

This is useful when the original source code is not available for modification to include @Qualifier annotation to pick the customized service implementation.

There is another XML configuration that wired the components together without using context component scanning for annotations, to show a different way of wiring the components together.

The customized components are retrofitted on purpose to demonstrate the capability to customize the beans according to each project.

Please refer to the Spring framework manual for more information on &lt;context:component-scan&gt; and the Spring annotations.

##Warning
The components mentioned in this project are fully wired by annotations. It is not tested for projects developed using XML configurations mix with annotations wiring.

Spring will fail if there are more than 1 primary component are found.

##License
Copyright 2013 Lim, Teck Hooi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

> http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
