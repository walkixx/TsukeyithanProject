
package Tsukeyithan.Packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NetHandler;
import net.minecraft.src.Packet;

public class Packet136AddSkillEffect extends Packet
{
        public int playerID;
        public byte skillID;
        public short skillDuration;
        
        public Packet136AddSkillEffect()
        {
        }

        public Packet136AddSkillEffect(int playerID, int skillID, int skillDuration)
        {
                this.playerID = playerID;
                this.skillID = (byte)skillID;
                this.skillDuration = (short)skillDuration;
        }

        public void readPacketData(DataInputStream datainputstream) throws IOException
        {
                this.playerID = datainputstream.readInt();    
                this.skillID = datainputstream.readByte();    
                this.skillDuration = datainputstream.readShort();  
        }

        public void writePacketData(DataOutputStream dataoutputstream) throws IOException
        {
                dataoutputstream.writeInt(this.playerID);
                dataoutputstream.writeByte(this.skillID);
                dataoutputstream.writeShort(this.skillDuration);
        }

        public void processPacket(NetHandler nethandler)
        {
                nethandler.handleAddSkillEffect(this);
        }

        public int getPacketSize()
        {
                return 20;
        }
}