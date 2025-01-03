/**
 * Support package for declarative JSR-107 caching configuration. Used by Spring's
 * caching configuration when it detects the JSR-107 API and Spring's JCache
 * implementation.
 *
 * <p>Provides an extension of the {@code CachingConfigurer} that exposes
 * the exception cache resolver to use (see {@code JCacheConfigurer}).
 */
@NullMarked
package org.springframework.cache.jcache.config;

import org.jspecify.annotations.NullMarked;
