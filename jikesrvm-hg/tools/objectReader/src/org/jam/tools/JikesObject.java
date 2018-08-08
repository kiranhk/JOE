package org.jam.tools;

public class JikesObject 
extends JObject
{
    private TIB tib;
    
    public JikesObject(MemoryReader memory, int address)
    {
        super(memory, address);
        tib = new TIB(memory, getInt(JAVA_HEADER_OFFSET));
    }
}
