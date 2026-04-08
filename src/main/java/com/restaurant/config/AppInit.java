package re.mvc.config;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Applnit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @org.jetbrains.annotations.Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // cấu hình servlet
        return new Class[0];
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WedConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}