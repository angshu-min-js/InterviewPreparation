## Created By Angshuman Gupta

### System Design

- A micro-services architecture:
- Architects are like town planner, they zone out the modules
- Between the zones --> services talk
- If one service decides to expose REST over HTTP, another makes use of protocol buffers, and a third uses Java RMI, then integration can become a nightmare as consuming services have to understand and support multiple styles of interchange
- Strategic Goals --> Architectural Principles --> Design and Delivery Practices
-  https://apigee.com/about/blog/technology/restful-api-design-nouns-are-good-verbs-are-bad
- Loose coupling and high cohesion
- A loosely coupled service knows as little as it needs to about the services with which it collaborates. This also means we probably want to limit the number of different types of calls from one service to another, because beyond the potential performance problem, chatty communication can lead to tight coupling
- And find boundaries within our problem domain that help ensure that related behavior is in one place, and that communicate with other boundaries as loosely as possible but with a high cohesion
- Bounded Context: A specific responsibility enforced by explicit boundaries.
- Example:
![alt text](https://raw.githubusercontent.com/angshu-min-js/InterviewPreparation/main/images/image01.jpg)
