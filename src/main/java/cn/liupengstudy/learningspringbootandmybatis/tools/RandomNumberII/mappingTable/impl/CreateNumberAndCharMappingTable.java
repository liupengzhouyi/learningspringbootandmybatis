package cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.impl;

import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.baseModel.NumberAndCharMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.mappintInterface.CreateMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.model.MappingTable;

public class CreateNumberAndCharMappingTable implements CreateMappingTable {

    private MappingTable mappingTable;


    public CreateNumberAndCharMappingTable() {
        this.CreateMappingTable();
    }

    /**
     * create Mapping Table
     */
    @Override
    public void CreateMappingTable() {
        this.setMappingTable(new MappingTable(NumberAndCharMappingTable.GetNumberAndCharMappingTable()));
    }


    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }
}
