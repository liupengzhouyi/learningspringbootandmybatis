package cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.impl;


import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.baseModel.CharMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.mappintInterface.CreateMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.model.MappingTable;

public class CreateCharMappingTable implements CreateMappingTable {

    private MappingTable mappingTable;


    public CreateCharMappingTable() {
        this.CreateMappingTable();
    }

    /**
     * create Mapping Table
     */
    @Override
    public void CreateMappingTable() {
        this.setMappingTable(new MappingTable(CharMappingTable.GetCharMappingTable()));
    }


    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }
}
