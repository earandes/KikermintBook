# Introducing Event Storming

Event Storming is a rapid design technique that is meant to engage both Domain Experts and developers in a fast-paced learning process.
It is focused on the business and business process rather than nouns and data.

## What advantages does it have?
- It is a very tactile approach. (Sticky and pen) (business and developers stand on equal ground as they learn together). Everyone provides **[Ubiquitous Language](https://martinfowler.com/bliki/UbiquitousLanguage.html)**
- It focuses everyone on events and business process rather than classes and databases. (ALWAYS business perspective no Users)
- It is a very visual approach. (dismisses code from experimentation)
- It is very fast and very cheap to perform.(remove sticky notes and throw it away)
- Your team will have breakthroughs in understanding.
- Everybody learns something. (Helps to everyone don't understand something)
- Use this for both big-picture and design-level modeling.
- It is unnecessary to limit the storming sessions to one.

## What will be need?
- Having the right people, domain experts and developers who are to work with on the model
- Everyone should come with an open mind that is free od strict judgment( More events is better tan less) The biggest mistake is people trying to be too correct too soon. Will refine after...
- Colors of sticky notes and black marker
- Wall

## Steps

1. Start with **domain events**, things happen in your model, left to right, and put with orange sticky note.
Use always verb past tense. Probably is not the first domain event, but is the first you know. 
We will start work together in both directions.
If you know more events happen in the same time put the other vertical to the other event. (Parallelism)
If you find trouble spots in your existing or new business process. Clearly mark these with purple/red stick and some text explains why it's a problem. You need to invest time at such points to learn more.
Reminder **FREE MIND (discuss later)**

    **Example**: 
    - Product Created
    - User Logged

    **Next questions**:
    - What happened (before/after) a product created?

    Review final step page 105

2. Identify **commands** that cause each domain event. 
The Command should be stated in the imperative.
Use blue sticky note just left of Domain Event. In pairs: Command/Event, Command/Event, ...
You can place a small yellow sticky note on the lower left corner with a sticky figure and the name of the role. 

    **Example**:
    - Create product
    - Product Owner
    
3. Associate the **Entity/Aggregate** on which the Command is executed and that produces the Domain Event outcome.
Great error if you start here first, this is why is third step. 
At this stage business experts will likely understand that the data comes into play. 
    Here some guidelines for modeling the Aggregates:
    - If don't like say aggregate you can say Entity or Data. Is important clarify concept that it represents.
    - You will probably find that Aggregates are repeatedly used. Don't rearrange your timeline, repeatedly if is necessary.
    - If discover some of the Aggregates are to complex, and you need to break these into a managed Process(lilac sticky)
    
    **Example**:
    - Product
        - Command: Create product
        - Domain Event: Product Created
    - BacklogItem
        - Command: Commit BacklogItem
        - Domain Event: BacklogItem Commited

4. **[Bounded Context](https://martinfowler.com/bliki/BoundedContext.html)**. Draw boundaries and lines with arrows to show flow on your modeling surface.
Use pink sticky notes to name bounded context and draw lines with arrowheads to show direction of Domain Events flowing between Bounded Contexts.

5. Identify the various **views** that your users will need to carry out their actions, and important roles for various users.
This notes are represented by green sticky notes, you can add if you want important user roles with small yellow sticky notes.

    **Example**:
    - BacklogItem View
    - Sprint View

## Conclusion
Event Storming is about learning and communicating design to see big picture from your business and business process. We will do in next internal meetups and improve about event storming.

### More links:
- [Domain-Driven Design Distilled](https://www.amazon.es/Domain-Driven-Design-Distilled-Vaughn-Vernon-ebook/dp/B01JJSGE5S/ref=tmm_kin_swatch_0?_encoding=UTF8&qid=&sr=)
- [Event Storming for Fun and Profit - Vaughn Vernon #scbcn16](https://www.youtube.com/watch?v=OcIu-dvrXhY)
- [Introducing Event Storiming - Alberto Brandolini](https://vimeo.com/130202708)

### Practices
- [Event Storming Online](https://webeventstorming.com/home)