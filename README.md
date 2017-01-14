# Java Lights Out Solver
## Examples
### Example 1
<table>
  <tr><th>Start grid</th><th>Pattern</th><th>:arrow_right:</th><th>Final grid</th></tr>
  <tr>
    <td><img src="./images/ex1/startGrid.png" width=100></td>
    <td><img src="./images/ex1/pattern.png" width=75></td>
    <td></td>
    <td><img src="./images/ex1/finalGrid.png" width=100></td>
  </tr>
</table>

```java
GridInterface startGrid = Utils.getEmptyGrid(4, 4);
GridInterface finalGrid = Utils.getFullGrid(4, 4);
PatternInterface pattern = Utils.getClassicPattern();

Solver solver = new Solver(startGrid, finalGrid, pattern);
Solutions solutions = solver.solve(); //compute all solutions

System.out.println(solutions);
```

<table>
  <tr><th colspan='8'>Solutions</th></tr>
  <tr>
    <td><img src="./images/ex1/sol/1.png" width=50></td>
    <td><img src="./images/ex1/sol/2.png" width=50></td>
    <td><img src="./images/ex1/sol/3.png" width=50></td>
    <td><img src="./images/ex1/sol/4.png" width=50></td>
    <td><img src="./images/ex1/sol/5.png" width=50></td>
    <td><img src="./images/ex1/sol/6.png" width=50></td>
    <td><img src="./images/ex1/sol/7.png" width=50></td>
    <td><img src="./images/ex1/sol/8.png" width=50></td>
  </tr>
  <tr>
    <td><img src="./images/ex1/sol/9.png" width=50></td>
    <td><img src="./images/ex1/sol/10.png" width=50></td>
    <td><img src="./images/ex1/sol/11.png" width=50></td>
    <td><img src="./images/ex1/sol/12.png" width=50></td>
    <td><img src="./images/ex1/sol/13.png" width=50></td>
    <td><img src="./images/ex1/sol/14.png" width=50></td>
    <td><img src="./images/ex1/sol/15.png" width=50></td>
    <td><img src="./images/ex1/sol/16.png" width=50></td>
  </tr>
</table>
