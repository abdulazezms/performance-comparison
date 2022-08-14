
# Performance Comparison

This is a demo project used to compare the performance of a multithreaded application when using mutex locks and when using advanced locks.



## Why advanced locks?
Let us consider a database where the read operations are very frequent while write operations are much less frequent. We need a lock to protect race conditions beteween read and write operations.
With a convetional mutex lock we can avoid race conditions, but such lock will only allow one thread to execute in critical sections.
With an advanced lock such as ReentrantReadWriteLock provided by Java API, however, we can allow multiple reader threads to execute in parallel in their critical sections as long as there is no writer thread is executing.
## Advantages of using Reentrant Read Write Lock
* Multiple reader threads can execute in parallel in critical sections.
* Performance Improvement.




## Use Case

We will assume that a publicly traded financial institution shares a database with its subscribers, on which they conduct various kinds of transactions. Subscriber transactions are used to either read the data or to modify the data.
## Performance Comparison 


I ran the two versions many times on my quad-core processor, which has 4 physical and 8 virtual cores.

* Number of reader threads = 7
* Number of writer threads = 1

![ComparisonTable](https://user-images.githubusercontent.com/75917617/184330299-c87a973c-c525-452c-8e7d-b20f63ada29c.png)



## Conclusion
In read intensive workload, using Reentrant Read Write Lock we are able to increase the performance 2x faster.
In other workload that is not as read intensive, the read write lock can perform worse than mutex lock.
