package Nodes;
import java.util.Scanner;


public class NodeTakeFuel implements RobotProgramNode {
	RobotProgramNode rpn;
	@Override
	public void execute(Robot robot) {
		robot.takeFuel();
	}
	
	@Override
	public RobotProgramNode parse(Scanner s) {
		if(!Parser.gobble(Parser.TAKEFUEL, s)){
	
	public String toString(){
		return ("takeFuel");
	}


}