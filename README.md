# README #

### WHAT THIS PROJECT IS (ABOUT) / HAS ###
This project is a library which contains all the interfaces and abstract classes to characterize an abstract agent or an avatar. The model is the following:
	A Body is a generic object (not in Java sense).
	An ActiveBody is a Body with Sensors and Actuators.
	Sensors and Actuators have respectively, a SensorPurpose and an ActuatorPurpose.
	A Mind is a generic control center.
	A PrincipalListener is special Mind (a listener for an external Mind).
	An AgentMind is a Mind only for Agents.
	An Avatar is an ActiveBody with a PrincipalListener.
	An Agent is an ActiveBody with an AgentMind.
	Both a PrincipalListener and an AgentMind can receive Analyzables from, respectively, an Avatar and an Agent.
	A Perception is a sub-interface of Analyzable.
	
The interfaces contain the public methods declarations, while the abstract classes (which implements from the interfaces and, usually, inherit from other abstract classes), contain the attributes and, in some cases, the implementation of ome methods of the interfaces.


### WHAT THIS PROJECT IS NOT (ABOUT) / HAS NOT ###

This project does not assume anything about any "place" where agents are placed in and/or act. Therefore there is no reference whatsoever to universe(s), containers, ambients, environments, etc.
Thid project does not assume any rule about how agents act. Therefore there is no reference to any physics, events or similar.


### THE TECHNOLOGY ###

The library requires Java 1.8 and Maven. It won't work without either. In Eclipse (provided a version of Java 1.8 is already installed) it is enough to have "m2e" installed from the Eclipse software repo.