
package Tsukeyithan.Packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NetHandler;
import net.minecraft.src.Packet;

public class Packet137RemoveSkillEffect extends Packet
{
        public int playerID;
        public byte skillID;
        public short skillDuration;
        
        public Packet137RemoveSkillEffect()
        {
        }

        public Packet137RemoveSkillEffect(int playerID, int skillID, int skillDuration)
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
                nethandler.handleRemoveSkillEffect(this);
        }

        public int getPacketSize()
        {
                return 20;
        }
}