package net.datafaker.providers.base;

import java.nio.file.FileSystems;

/**
 * @since 0.8.0
 */
public class File extends AbstractProvider<BaseProviders> {

    protected File(BaseProviders faker) {
        super(faker);
    }

    public String extension() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mimeType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String fileName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String fileName(String dirOrNull, String nameOrNull, String extensionOrNull, String separatorOrNull) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
