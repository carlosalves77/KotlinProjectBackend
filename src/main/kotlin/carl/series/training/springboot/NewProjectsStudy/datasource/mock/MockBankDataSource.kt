package carl.series.training.springboot.NewProjectsStudy.datasource.mock

import carl.series.training.springboot.NewProjectsStudy.datasource.BankDataSource
import carl.series.training.springboot.NewProjectsStudy.model.Bank
import org.springframework.stereotype.Repository

val banks = listOf(
    Bank(
        "1, 2, 3",
        3.14,
        1
    ),
    Bank(
        "1, 5, 9",
        0.2,
        19
    ),
    Bank(
        "1, 3, 3",
        12.90,
        19
    ),
    Bank(
        "1, 6, 3",
        0.0,
        0
    )
)

@Repository
class MockBankDataSource : BankDataSource {
    override fun retrieveBanks(): Collection<Bank> {

        return banks
    }


}