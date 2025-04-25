# Order Management System (Git Learning)

## Project Description
A simple Java-based order management system to learn Git. Includes `Order` (id, productId, quantity), `OrderManager` (add, search orders), and `Main` for testing. Demonstrates Git commands: init, add, commit, push, pull, branch, merge, and conflict resolution.

## How to Run
1. **Prerequisites**:
   - JDK 8 or higher
   - Git
   - GitHub account
2. **Steps**:
   - Clone: `git clone https://github.com/your-username/order-management.git`
   - Compile: `javac src/*.java`
   - Run: `java -cp src Main`

## Code Structure
- **src/Order.java**: Defines order with id, productId, quantity.
- **src/OrderManager.java**: Manages orders with add and search methods.
- **src/Main.java**: Tests the system.
- **.gitignore**: Ignores NetBeans files and bytecode.

## Git Instructions
### Part 1: Setup and Commit
1. Initialize: `git init`
2. Add files: `git add .gitignore src/`
3. Commit: `git commit -m "Initial commit: Add Order, OrderManager, and Main classes"`
4. Link GitHub: `git remote add origin https://github.com/your-username/order-management.git`
5. Push: `git push -u origin master`

### Part 2: Branching, Merging, Conflicts
1. Create branch: `git checkout -b feature/add-search`
2. Add feature, commit, push: `git add src/OrderManager.java && git commit -m "Add searchByProductId" && git push origin feature/add-search`
3. Merge: `git checkout master && git merge feature/add-search && git push origin master`
4. Resolve conflict:
   - On `feature/update-search`, add logging.
   - On `master`, add console print.
   - Merge: `git checkout feature/update-search && git merge master`
   - Edit conflicted file, then: `git add . && git commit`

## Debug Git Issues
- Check status: `git status`
- View history: `git log --oneline`
- Pull before push: `git pull origin master`
- Resolve conflicts by editing files and committing.

## Example Usage
```java
OrderManager manager = new OrderManager();
manager.addOrder(new Order("1", "P001", 10));
System.out.println(manager.searchByProductId("P001").size());
```