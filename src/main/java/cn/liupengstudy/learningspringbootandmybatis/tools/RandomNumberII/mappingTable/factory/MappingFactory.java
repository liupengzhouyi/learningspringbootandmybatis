package cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.factory;

import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.impl.CreateCharMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.impl.CreateNumberAndCharMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.impl.CreateNumberMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.model.MappingTable;

public class MappingFactory {

    private MappingTable mappingTable;

    private int kind;

    public MappingFactory(int kind) {
        this.setKind(kind);
        this.factory();
    }

    /**
     * 1 : char
     * 2 : number and char
     * 3 : number
     */
    public void factory() {
        switch (this.getKind()) {
            case 1 : {
                this.setMappingTable(new CreateCharMappingTable().getMappingTable());
                break;
            }
            case 2 : {
                this.setMappingTable(new CreateNumberAndCharMappingTable().getMappingTable());
                break;
            }
            case 3 : {
                this.setMappingTable(new CreateNumberMappingTable().getMappingTable());
                break;
            }
        }
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }
}
