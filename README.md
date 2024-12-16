Requirements
The parking lot should have multiple levels, each level with a certain number of parking spots.

The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks.

Each parking spot should be able to accommodate a specific type of vehicle.

The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.

The system should track the availability of parking spots and provide real-time information to customers.

The system should handle multiple entry and exit points and support concurrent access.

**Learning from the code**

1. Make Constructor private while creating Singleton class so that user can not initialized object every time. It should allow following singleton theory.

2. Always prefer abstract classes vs enum to allow Open for extension closed for modification principle.

3. In this code we have created  ParkingSpotEnum for handling all the classes which is extending Parking Spot Class.

4. AtomicInteger is used when you need a mutable integer that can safely be updated in a concurrent environment without requiring external synchronization mechanisms like synchronized blocks.

5. Make atomic integer private static and final
   private: The variable is accessible only within the class it is defined in.
   static: The variable is shared across all instances of the class.
   final: The reference to the AtomicInteger instance cannot be changed (but its value can still be updated).

6. **The common use cases of AtomicInteger are**:

            Thread-safe Increment/Decrement: It provides methods like incrementAndGet(), decrementAndGet(), and getAndIncrement() that perform atomic operations.
            Compare-And-Set (CAS) Operations: The compareAndSet(expectedValue, newValue) method allows you to update the value only if it matches a given expected value, avoiding race conditions.
            Atomic Operations: Ensures visibility and atomicity for updates, eliminating the need for locks.

7. **Benefits**
Thread-Safety: Prevents data corruption in multithreaded environments.
Performance: More efficient than locking (e.g., using synchronized) in many cases, as it minimizes context switching and contention.



   

