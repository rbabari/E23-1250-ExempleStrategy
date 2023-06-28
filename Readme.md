classDiagram
direction BT
class AggressiveBehavior {
  + AggressiveBehavior() 
  + moveCommand() int
}
class DeffensiveBehavior {
  + DeffensiveBehavior() 
  + moveCommand() int
}
class IBehavior {
<<Interface>>
  + moveCommand() int
}
class Main {
  + Main() 
  + main(String[]) void
}
class Robot {
  + Robot(String) 
  ~ IBehavior behavior
  ~ String name
  + move() void
  + setBehavior(IBehavior) void
}
class normalBehavior {
  + normalBehavior() 
  + moveCommand() int
}

AggressiveBehavior  ..>  IBehavior 
DeffensiveBehavior  ..>  IBehavior 
Main  ..>  AggressiveBehavior : «create»
Main  ..>  DeffensiveBehavior : «create»
Main  ..>  Robot : «create»
Main  ..>  normalBehavior : «create»
Robot "1" *--> "behavior 1" IBehavior 
normalBehavior  ..>  IBehavior 
