Adapter Design Pattern is a Structural Design Pattern - Adapter pattern works as a bridge between two incompatible interfaces.

This pattern involves a single class which is responsible to join functionalities of independent 
or incompatible interfaces. A real life example could be a case of card reader which acts as 
an adapter between memory card and a laptop. You plugin the memory card into card reader and 
card reader into the laptop so that memory card can be read via laptop.

Adapter (recognizeable by creational methods taking an instance of different abstract/interface type 
and returning an implementation of own/another abstract/interface type which decorates/overrides the given instance)
1). java.util.Arrays#asList()
2). java.io.InputStreamReader(InputStream) (returns a Reader)
3). java.io.OutputStreamWriter(OutputStream) (returns a Writer)
4). javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()

Reference - http://www.tutorialspoint.com/design_pattern/adapter_pattern.htm