package command;

import domein.Command;
import domein.Light;
import domein.LightOffCommand;
import domein.LightOnCommand;
import domein.MacroCommand;
import domein.RemoteControl;
import domein.Stereo;
import domein.StereoOffCommand;
import domein.StereoOnWithCDCommand;

public class RemoteLoader {

	public static void main(String[] args) {

		// definiëren van controller
		RemoteControl remoteControl = new RemoteControl();

		// definiëren apparaten
		Light light1 = new Light("Living Room Lighting");
		Light light2 = new Light("Kitchen Room Lighting");
		Stereo stereo = new Stereo("Stereo");
		
		// definieren commands 
		LightOnCommand light1On = new LightOnCommand(light1);
		LightOnCommand light2On = new LightOnCommand(light2);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		LightOffCommand light1Off = new LightOffCommand(light1);
		LightOffCommand light2Off = new LightOffCommand(light2);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		// toevoegen  van commands in array
		Command[] partyOn = { light1On, light2On, stereoOn };
		Command[] partyOff = { light1Off, light2Off, stereoOff };

		// make execute command to execute all commands
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");

		// execute all commands in macro command (calls macrocommandExecute#Execute
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}

}
