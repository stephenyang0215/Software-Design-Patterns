Open Source Project:</br>
Caffeine(https://github.com/ben-manes/caffeine)</br>
Name: Stephen Yang</br>

Adapter Pattern</br>
<ol>
  <li>
    <ol>
      <li>LoadingCache: Interface Client Interface</li>
      <li>CaffeinatedGuava: Class Adapter</li>
      <li>Caffeine: Class Service</li>
      <li>AsyncCacheLoader: Interface Interface for the service</li>
      <li>CacheLoader: Interface Service</li>
    </ol>
  </li>
  <li>
    In the Guava package, CaffeinatedGuava works as an adapter to expose Caffeine’s cache. The client can call the adapter to wrap Caffeine’s build function to make it compatible and return the cache. The Guava facade(LoadingCache) describes a protocol that the classes should follow to work with the client.
  </li>
  <li>
    This pattern demonstrates the adapter can expose the cache through different cache loaders.
    The adapter uses a builder and loader as parameters. The builder is the configured cache builder, and the loader is used to receive a new cache value. Developers can pass in new loaders or create a new build function to return the expected cache. It provides flexibility to add new loaders and return the cache wrapped in the Guava facade.
  </li>
</ol>
Strategy Pattern
<ol>
  <li>
    <ol>
      <li>Caffeine: Class The context</li>
      <li>Cache: Class Concrete strategy</li>
      <li>LoadingCache: Class Concrete strategy</li>
      <li>AsyncCache: Class Concrete strategy</li>
      <li>AsyncLoadingCache: Class Concrete strategy</li>
    </ol>
  <li>
    Caffeine works as the context have the methods to communicate with the concrete strategies. It has an explicit build method for one strategy, which is used to instantiate the concrete class. The concrete class has the methods to operate with cache entries.
  </li>
  <li>
    Caffeine has four cache population strategies, which use the strategy pattern to provide concrete strategies. It offers developers the flexibility to add or remove new strategies. You can develop a unique build method for a new concrete strategy to work with caches.
  </li>
</ol>

Observer Pattern
<ol>
  <li>
    <ol>
      <li>EventDispatcher: Class Publisher</li>
      <li>EventTypeAwareListener: Class Concrete Subscriber</li>
      <li>CacheEntryCreatedListener: Interface Subscriber Interface</li>
      <li>CacheEntryRemovedListener: Interface Subscriber Interface</li>
      <li>CacheEntryUpdatedListener: Interface Subscriber Interface</li>
      <li>CacheEntryExpiredListener: Interface Subscriber Interface</li>
    </ol>
  <li>
    In this case, EventDispatcher is the publisher that dispatches cache events to the associated listeners.
    EventTypeAwareListener is the concrete object that receives cache events from the publisher and manages multiple listeners to update its associated listeners in response to notifications from the publisher. EventTypeAwareListener invokes the listeners by implementing the java.cache.event interfaces.
  </li>
  <li>
  EventTypeAwareListener has four listeners for different event types, which will consume the event if the listener it owns supports the action. The object provides flexibility, allowing developers to add listeners to or remove them from EventTypeAwareListener. EventDispatcher allows listeners to dynamically subscribe to and unsubscribe from cache events.
  </li>
</ol>
