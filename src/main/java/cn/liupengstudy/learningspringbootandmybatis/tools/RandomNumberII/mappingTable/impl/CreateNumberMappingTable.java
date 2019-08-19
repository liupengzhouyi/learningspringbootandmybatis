package cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.impl;

import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.baseModel.NumberMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.mappingTable.mappintInterface.CreateMappingTable;
import cn.liupengstudy.learningspringbootandmybatis.tools.RandomNumberII.model.MappingTable;

public class CreateNumberMappingTable implements CreateMappingTable {

    private MappingTable mappingTable;


    public CreateNumberMappingTable() {
        this.CreateMappingTable();
    }

    /**
     * create Mapping Table
     */
    @Override
    public void CreateMappingTable() {
        this.setMappingTable(new MappingTable(NumberMappingTable.GetNumberMappingTable()));
    }


    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }
}
