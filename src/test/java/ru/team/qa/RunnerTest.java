import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * features – путь к папке с .feature файлами. Поиск осуществляется в указанной и во всех дочерних папках.
 * Можно указать несколько папок, например: features = {«src/test/features», «src/test/feat»};
 *
 * glue – пакет, в котором находятся классы с реализацией шагов и «хуков».
 * Можно указать несколько пакетов, например, так: glue = {«ru.savkk.test», «ru.savkk.hooks»};
 *
 * tags – фильтр запускаемых тестов по тэгам. Список тэгов можно перечислить через запятую.
 * Символ ~ исключает тест из списка запускаемых тестов, например ~@fail;
 *
 * dryRun – если true, то сразу после запуска теста идёт проверка, все ли шаги теста разработаны, если нет, то выдает предупреждение.
 * При false предупреждение будет выдаваться по достижении неразработанного шага. По умолчанию false.
 *
 * strict – если true, то при встрече неразработанного шага тест остановится с ошибкой.
 * False — неразработанные шаги пропускаются. По умолчанию false.
 *
 * snippets – указывает в каком формате фреймворк будет предлагать шаблон для нереализованных шагов.
 * Доступны значения: SnippetType.CAMELCASE, SnippetType.UNDERSCORE.
 *
 * name – фильтрует запускаемые тесты по названиям удовлетворяющим регулярному выражению.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "ru.savkk.test",
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE,
//        name = "^Успешное|Успешная.*"
)
public class RunnerTest {

}