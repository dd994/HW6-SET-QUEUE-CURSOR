# HW6-SET-QUEUE-CURSOR
1.Explain what comparator is comparable. What is their difference?

Comparator and Comparable are both interfaces.
A collection is Comparable, when an object can be compared to another object.
A comparator, by contrast, is a way to compare objects.
you can implement your own sorting methods through the compiler, while there comparable is only standard sorting



2.Why is PriorityQueue MAX capacity MAX_INTEGER- 8? And why is the initial capacity 11?

VM in this context refers to a JVM (Java Virtual Machine), the piece of software that executes Java byte code.
There are several different implementations for this software (most notable today - Oracle's and the OpenJDK's). Some of these implementations may add some additional memory to arrays for their internal purposes (e.g., tracking garbage collection). Since the JDK attempts to be ass generic as possible, and run on any JVM, it takes a precaution and will not allow you to create a PriorityQueue which internally uses an array longer than Integer.MAX_VALUE - 8.

A priority queue is unbounded, but has an internal capacity governing the size of an array used to store the elements on the queue. It is always at least as large as the queue size. As elements are added to a priority queue, its capacity grows automatically. The details of the growth policy are not specified.
