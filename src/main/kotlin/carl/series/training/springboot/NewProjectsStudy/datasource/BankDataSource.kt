package carl.series.training.springboot.NewProjectsStudy.datasource

import carl.series.training.springboot.NewProjectsStudy.model.Bank

interface BankDataSource {

    fun retrieveBanks() : Collection<Bank>
}