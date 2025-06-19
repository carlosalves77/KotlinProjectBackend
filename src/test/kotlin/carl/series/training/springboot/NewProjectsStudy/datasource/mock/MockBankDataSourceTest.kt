package carl.series.training.springboot.NewProjectsStudy.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

internal class MockBankDataSourceTest {

    private val mockDatasource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
       // GIVEN

       // When

        val banks = mockDatasource.retrieveBanks()
       
       // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }
    
    @Test
    fun `should provide some mock data`() {

       // When
        val banks = mockDatasource.retrieveBanks()
       // then

        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }

    }


}