## Inspiration
Allow patients to engage with their own medical care through an Android application and Estimote Beacon. Our team is from the US, Romania, and Lithuania so we wanted to build something that could be used globally and lent some transparency to the classic "grab a ticket and wait" experience. 

## What it does
- Allows patients to be automatically checked in to their doctor's office when their phones cross a geo-fence, informs them on their doctor's education and specialist background, and pings them their position in the queue
- Provides a secure platform for doctor's offices to engage with patients onsite and give them more control over their care

## How we built it
Android app with Estimo SDK, NodeJS server as doctor's office system 

## Challenges we ran into
With all hardware, it was glitchy to set up the Estimo SDK and phones picked up the Bluetooth Smart signal from the Android app with various levels of success. Also the Beacons are registered to MLH and we could not claim administrative auth for our app, so we were unable to configure attributes such as their range, temperature sensors, or motion sensors.
Another challenge we ran into was linking the Android with the NodeJS backend. We did not foresee some errors we got through trying to ping on a localhost and also emulating through a virtual device. 
Lastly, shout out to Pau who sat across from us during the hackathon and let us commadeer his Android phone because none of us had one. 

## Accomplishments that we're proud of
- Successfully used Estimo SDK on the Android app to create a geofence around a sample doctor's office, allows automatic patient check in the second they walk in
- Built a NodeJS server with doctor's office information such as current queueing information and currently available doctor; it serves as source of truth for all patients pulling information about the doctor's office
- Multiple phone suport - patients are put into a queue once they check in to the appointment and dequeued as doctors become available


## What we learned
- Hardware is hard but still cool
- Simulating on the Estimote Beacon requires a lot of walking around to go in and outside of the fence
- Android and Git sometimes don't play well together
- How to make calls to a NodeJS server on a localhost from an Android app
- Using Android Notification interface to check in and check out patients

## What's next for dr-beacon
- Extend the platform to enable clinics to notify users of local health advisories (flu shot, high pollen, etc.)
- Enable pharmaceutical companies to reach patients as they wait in the doctor's office so they can directly ask doctors questions about if the medication is right for them
- Support multiple beacons in which clinics can know when patients check-in to their appointment, enter into the actual exam room, finish their pre-op or scans
